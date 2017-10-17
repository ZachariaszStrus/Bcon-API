package com.dzik.bcon.repository

import com.dzik.bcon.model.Order
import com.dzik.bcon.model.utils.OrderStatus
import org.springframework.data.jpa.repository.JpaRepository


interface OrderRepository : JpaRepository<Order, Int> {
    fun findByStatus(status: OrderStatus): MutableList<Order>
}