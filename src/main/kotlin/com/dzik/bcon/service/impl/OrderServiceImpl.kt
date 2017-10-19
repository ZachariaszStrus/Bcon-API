package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.repository.MenuItemRepository
import com.dzik.bcon.repository.OrderItemRepository
import com.dzik.bcon.repository.OrderRepository
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.model.utils.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class OrderServiceImpl(
        val orderRepository: OrderRepository
) : OrderService {
    override fun updateStatus(orderId: Int, newStatus: OrderStatus): Order? {
        val order = orderRepository.getOne(orderId)
        return orderRepository.save(order.copy(status = newStatus))
    }

    override fun getOrderList(status: OrderStatus?): MutableList<Order> {
        return if(status == null) { orderRepository.findAll() }
        else { orderRepository.findByStatus(status) }
    }

    override fun addNewOrder(orderRequest: OrderRequest): Order? {
        val orderItems = orderRequest.orderItemRequestList
                .map { (menuItemId, _) ->
                    OrderItem(menuItemId = menuItemId)
                } .toSet()

        val order = Order(
                restaurantId = orderRequest.restaurant_id,
                table = orderRequest.table,
                orderItems = orderItems
        )

        return orderRepository.save(order)
    }
}