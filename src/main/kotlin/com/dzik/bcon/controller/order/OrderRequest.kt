package com.dzik.bcon.controller.order

data class OrderRequest (
        val restaurant_id: Int,
        val table: Int,
        val orderItemRequestList: List<OrderItemRequest>
)