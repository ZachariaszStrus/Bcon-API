package com.dzik.bcon.service

import com.dzik.bcon.controller.order.OrderListItem
import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderStatus


interface OrderService {
    fun addNewOrder(orderRequest: OrderRequest): Order?
    fun getOrderList(status: OrderStatus?): ArrayList<OrderListItem>
    fun getOrderListItem(order: Order): OrderListItem
    fun updateStatus(orderId: Int, newStatus: OrderStatus): Order?
}