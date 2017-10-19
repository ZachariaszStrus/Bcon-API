package com.dzik.bcon.controller.order

data class OrderRequest (
        val restaurant_id: Int = 0,
        val table: Int = 0,
        val orderItemRequestList: List<OrderItemRequest> = emptyList()
)