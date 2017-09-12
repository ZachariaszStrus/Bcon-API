package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderStatus
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class OrderDaoImpl(val jdbcTemplate: JdbcTemplate) : OrderDao {
    val orderMapper = { rs: ResultSet, rn: Int ->
        Order(rs.getInt("id"), rs.getInt("restaurant_id"),
                rs.getInt("table"), OrderStatus.valueOf(rs.getString("status")))
    }

    override fun findByStatus(status: OrderStatus): MutableList<Order> {
        return jdbcTemplate.query(
                "SELECT * FROM \"order\" WHERE status = '${status.name}'",
                orderMapper
        )    }

    override fun create(entity: Order): Order? {
        return entity.copy(id =
        jdbcTemplate.update("INSERT INTO order VALUES (" +
                "${entity.restaurant_id}, ${entity.table}, ${entity.status.name})"))
    }

    override fun find(key: Int): Order? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): MutableList<Order> {
        return jdbcTemplate.query(
                "SELECT * FROM \"order\"",
                orderMapper
        )
    }

    override fun update(entity: Order): Order? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: Order): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}