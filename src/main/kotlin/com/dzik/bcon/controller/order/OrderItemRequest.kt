package com.dzik.bcon.controller.order

data class OrderItemRequest (
        val menu_id: Int,
        val quantity: Int = 1
)