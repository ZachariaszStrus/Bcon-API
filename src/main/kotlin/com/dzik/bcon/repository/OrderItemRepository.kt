package com.dzik.bcon.repository

import com.dzik.bcon.model.OrderItem
import org.springframework.data.jpa.repository.JpaRepository


interface OrderItemRepository : JpaRepository<OrderItem, Int> {
    fun findByOrderId(orderId: Int): MutableList<OrderItem>
}