package com.dzik.bcon.controller.order

import com.dzik.bcon.model.Order
import com.dzik.bcon.model.utils.OrderStatus


data class GetOrderListResponse(
        val id: Int?,
        val tableNumber: Int,
        val tableName: String,
        val status: OrderStatus,
        val items: List<GetOrderListItem>
) {
    constructor(order: Order) : this(
            order.id,
            order.table.number,
            order.table.name,
            order.status,
            order.orderItems.map { oi ->
                GetOrderListItem(oi.menuItem?.name, oi.menuItem?.price, oi.quantity)
            }
    )
}

data class GetOrderListItem(
        val name: String?,
        val price: Float?,
        val quantity: Int?
)