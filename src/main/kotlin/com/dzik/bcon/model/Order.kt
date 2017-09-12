package com.dzik.bcon.model


data class Order (
        val id: Int,
        val restaurant_id: Int,
        val table: Int,
        val status: OrderStatus = OrderStatus.PENDING
)