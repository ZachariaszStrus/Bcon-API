package com.dzik.bcon.service

import com.dzik.bcon.controller.order.OrderRequest

interface OrderService {
    fun addNewOrder(orderRequest: OrderRequest): Boolean
}