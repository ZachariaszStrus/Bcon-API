package com.dzik.bcon.service

import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.controller.order.OrderListItem
import com.dzik.bcon.model.OrderStatus


interface OrderService {
    fun addNewOrder(orderRequest: OrderRequest): Boolean
    fun getOrderList(status: OrderStatus?): ArrayList<OrderListItem>
}