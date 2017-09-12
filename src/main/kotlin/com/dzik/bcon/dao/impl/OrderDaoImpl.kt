package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.model.Order
import org.springframework.jdbc.core.JdbcTemplate

class OrderDaoImpl(private val jdbcTemplate: JdbcTemplate) : OrderDao {
    override fun create(entity: Order): Order? {
        return entity.copy(id =
        jdbcTemplate.update("INSERT INTO order VALUES (" +
                "${entity.restaurant_id}, ${entity.table}, ${entity.status.name})"))
    }

    override fun find(key: Int): Order? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): MutableList<Order> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(entity: Order): Order? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: Order): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}