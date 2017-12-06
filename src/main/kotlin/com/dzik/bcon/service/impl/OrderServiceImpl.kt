package com.dzik.bcon.service.impl

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.model.utils.OrderStatus
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.repository.BeaconRepository
import com.dzik.bcon.repository.MenuItemRepository
import com.dzik.bcon.repository.OrderRepository
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.service.OrderService
import com.dzik.bcon.service.firebase.AndroidPushNotificationsService
import com.dzik.bcon.service.firebase.FirebaseMessage
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class OrderServiceImpl(
        val orderRepository: OrderRepository,
        val restaurantRepository: RestaurantRepository,
        val menuItemRepository: MenuItemRepository,
        val beaconRepository: BeaconRepository,
        val androidPushNotificationsService: AndroidPushNotificationsService
) : OrderService {

    override fun updateStatus(orderId: Int, newStatus: OrderStatus): Order? {
        val userDetails = SecurityContextHolder.getContext().authentication.principal as CustomUserDetails
        val restaurantRole = userDetails.user.roles.first { it.name == UserRoleType.RESTAURANT_EMPLOYEE }

        val order = orderRepository.getOne(orderId)

        if(order.table.restaurant.id != restaurantRole.restaurantId) {
            throw UnauthorizedUserException("Unauthorized")
        }

        if(order.fcmToken.isNotBlank()) {
            androidPushNotificationsService.sendMessage(FirebaseMessage(
                    to = order.fcmToken,
                    title = "Status update",
                    body = newStatus.toString()
            ))
        }

        return orderRepository.save(order.copy(status = newStatus))
    }

    override fun getOrderList(status: OrderStatus?): List<Order> {
        val userDetails = SecurityContextHolder.getContext().authentication.principal as CustomUserDetails
        val restaurantRole = userDetails.user.roles.first { it.name == UserRoleType.RESTAURANT_EMPLOYEE }
        val restaurant = restaurantRepository.findOne(restaurantRole.restaurantId)

        val orders = mutableListOf<Order>()
        restaurant.tables.forEach {
            orders.addAll(orderRepository.findByTable(it))
        }

        return if(status == null) { orders }
        else { orders.filter { it.status == status } }
    }

    override fun addNewOrder(orderRequest: OrderRequest): Order? {
        val beacon = beaconRepository
                .findByNamespaceAndInstance(
                        orderRequest.beaconUID.namespace,
                        orderRequest.beaconUID.instance
                ) ?: return null

        beacon.restaurantTable ?: return null

        val order = Order(
                table = beacon.restaurantTable!!,
                orderItems = emptySet(),
                fcmToken = orderRequest.fcmToken
        )

        val orderItems = orderRequest.orderItemRequestList
                .map {
                    OrderItem(
                            menuItemId = it.menuItemId,
                            menuItem = menuItemRepository.findOne(it.menuItemId),
                            quantity = it.quantity
                    )
                } .toSet()

        order.orderItems = orderItems

        return orderRepository.save(order)
    }
}