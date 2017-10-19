package com.dzik.bcon.controller.order

data class OrderItemRequest (
        val menuItemId: Int = 0,
        val quantity: Int = 0
)