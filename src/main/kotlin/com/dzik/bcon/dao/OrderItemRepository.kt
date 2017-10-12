package com.dzik.bcon.dao

import com.dzik.bcon.model.OrderItem
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


@Transactional
interface OrderItemRepository : JpaRepository<OrderItem, Int> {
    fun findByOrderId(orderId: Int): MutableList<OrderItem>
}