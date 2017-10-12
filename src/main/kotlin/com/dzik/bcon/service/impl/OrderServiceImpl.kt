package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.order.OrderListItem
import com.dzik.bcon.controller.order.OrderMenuItem
import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.dao.MenuItemRepository
import com.dzik.bcon.dao.OrderItemRepository
import com.dzik.bcon.dao.OrderRepository
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.stereotype.Service
//        ?Zaki to pedal

@Service
class OrderServiceImpl(
        val orderRepository: OrderRepository,
        val orderItemRepository: OrderItemRepository,
        val menuItemRepository: MenuItemRepository
) : OrderService {
    override fun updateStatus(orderId: Int, newStatus: OrderStatus): Order? {
        val order = orderRepository.getOne(orderId)
        return orderRepository.save(order.copy(status = newStatus))
    }

    override fun getOrderList(status: OrderStatus?): ArrayList<OrderListItem> {
        val result = arrayListOf<OrderListItem>()

        val orders =
                if(status == null) { orderRepository.findAll() }
                else { orderRepository.findByStatus(status) }

        orders.forEach { result.add(getOrderListItem(it)) }
        return result
    }

    override fun getOrderListItem(order: Order): OrderListItem {
        val orderMenuItems = orderItemRepository
                .findByOrderId(order.id!!)
                .map { orderItem ->
                    val menuItem = menuItemRepository.getOne(orderItem.menuItemId)
                    if(menuItem != null) OrderMenuItem(menuItem.name, menuItem.price)
                    else null
                } as ArrayList<OrderMenuItem?>

        return OrderListItem(
                        order.id,
                        order.table,
                        orderMenuItems
                )
    }

    override fun addNewOrder(orderRequest: OrderRequest): Order? {
        val order = orderRepository.save(
                Order(null, orderRequest.restaurant_id, orderRequest.table))

        orderRequest.orderItemRequestList.forEach { (menu_id) ->
            orderItemRepository.save(OrderItem(null, order.id!!, menu_id))
        }

        return order
    }
}