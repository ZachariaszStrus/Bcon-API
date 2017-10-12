package com.dzik.bcon.dao

import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderStatus
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


@Transactional
interface OrderRepository : JpaRepository<Order, Int> {
    fun findByStatus(status: OrderStatus): MutableList<Order>
}