package com.dzik.bcon.controller.order

import com.dzik.bcon.model.Order


data class GetOrderListResponse(
        val order_id: Int?,
        val table: Int,
        val items: List<Pair<String, Float>>
) {
    constructor(order: Order) : this(
            order.id,
            order.table,
            order.orderItems.map { oi -> Pair(oi.menuItem.name, oi.menuItem.price) }
    )
}