package com.dzik.bcon.service.impl

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.model.utils.OrderStatus
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.repository.MenuItemRepository
import com.dzik.bcon.repository.OrderRepository
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.repository.TableRepository
import com.dzik.bcon.service.OrderService
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class OrderServiceImpl(
        val orderRepository: OrderRepository,
        val tableRepository: TableRepository,
        val restaurantRepository: RestaurantRepository,
        val menuItemRepository: MenuItemRepository
) : OrderService {

    override fun updateStatus(orderId: Int, newStatus: OrderStatus): Order? {
        val userDetails = SecurityContextHolder.getContext().authentication.principal as CustomUserDetails
        val restaurantRole = userDetails.user.roles.first { it.name == UserRoleType.RESTAURANT_EMPLOYEE }

        val order = orderRepository.getOne(orderId)

        if(order.table.restaurant.id != restaurantRole.restaurantId) {
            throw UnauthorizedUserException("Unauthorized")
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
        val restaurant = restaurantRepository.findOne(orderRequest.restaurant_id)

        val table = tableRepository.findByNumberAndRestaurant(orderRequest.table, restaurant)

        val order = Order(
                table = table,
                orderItems = emptySet()
        )

        val orderItems = orderRequest.orderItemRequestList
                .map { (menuItemId, _) ->
                    OrderItem(
                            menuItemId = menuItemId,
                            menuItem = menuItemRepository.findOne(menuItemId)
                    )
                } .toSet()

        order.orderItems = orderItems

        return orderRepository.save(order)
    }
}