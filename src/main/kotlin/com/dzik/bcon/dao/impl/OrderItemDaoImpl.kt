package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.OrderItemDao
import com.dzik.bcon.model.OrderItem
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.simple.SimpleJdbcInsert

class OrderItemDaoImpl(private val jdbcTemplate: JdbcTemplate) : OrderItemDao {
    override fun create(entity: OrderItem): OrderItem? {
        return entity.copy(id =
        jdbcTemplate.update("INSERT INTO order_item VALUES (" +
                "${entity.order_id}, ?${entity.menu_item_id})"))
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