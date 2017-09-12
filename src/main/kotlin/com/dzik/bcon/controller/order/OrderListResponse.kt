package com.dzik.bcon.controller.order


data class OrderListItem(
        val order_id: Int,
        val table: Int,
        val items: ArrayList<OrderMenuItem?>
)

data class OrderMenuItem(
        val name: String,
        val price: Float
)