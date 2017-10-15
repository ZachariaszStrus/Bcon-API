package com.dzik.bcon.controller.order

import com.dzik.bcon.model.Order


data class GetOrderListResponse(
        val id: Int?,
        val table: Int,
        val items: List<GetOrderListItem>
) {
    constructor(order: Order) : this(
            order.id,
            order.table,
            order.orderItems.map { oi ->
                GetOrderListItem(oi.menuItem.name, oi.menuItem.price)
            }
    )
}

data class GetOrderListItem(
        val name: String,
        val price: Float
)