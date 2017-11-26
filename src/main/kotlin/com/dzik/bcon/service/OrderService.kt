package com.dzik.bcon.service

import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.utils.OrderStatus
import org.springframework.security.access.prepost.PreAuthorize


interface OrderService {

    fun addNewOrder(orderRequest: OrderRequest): Order?

    @PreAuthorize("isAuthenticated()")
    fun getOrderList(status: OrderStatus?): List<Order>

    @PreAuthorize("isAuthenticated()")
    fun updateStatus(orderId: Int, newStatus: OrderStatus): Order?

}