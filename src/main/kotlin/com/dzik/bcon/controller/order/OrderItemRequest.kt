package com.dzik.bcon.controller.order

data class OrderItemRequest (
        val menuItemId: Int,
        val quantity: Int = 1
)