package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.OrderItemDao
import com.dzik.bcon.model.OrderItem
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class OrderItemDaoImpl(val jdbcTemplate: JdbcTemplate) : OrderItemDao {
    val orderItemMapper = { rs: ResultSet, rn: Int ->
        OrderItem(rs.getInt("id"), rs.getInt("order_id"), rs.getInt("menu_item_id"))
    }

    override fun findByOrderId(order_id: Int): MutableList<OrderItem> {
        return jdbcTemplate.query(
                "SELECT * FROM order_item WHERE order_id = $order_id",
                orderItemMapper
        )
    }

    override fun create(entity: OrderItem): OrderItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun find(key: Int): OrderItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): MutableList<OrderItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(entity: OrderItem): OrderItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: OrderItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}