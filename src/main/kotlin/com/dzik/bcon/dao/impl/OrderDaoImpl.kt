package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderStatus
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class OrderDaoImpl(val jdbcTemplate: JdbcTemplate) : OrderDao {
    val TABLE_NAME = "\"order\""

    val orderMapper = { rs: ResultSet, rn: Int ->
        Order(rs.getInt("id"), rs.getInt("restaurant_id"),
                rs.getInt("table"), OrderStatus.valueOf(rs.getString("status")))
    }

    override fun findByStatus(status: OrderStatus): MutableList<Order> {
        return jdbcTemplate.query(
                "SELECT * FROM $TABLE_NAME WHERE status = '${status.name}'",
                orderMapper
        )
    }

    override fun create(entity: Order): Order? {
        return entity.copy(id =
        jdbcTemplate.queryForObject("INSERT INTO $TABLE_NAME VALUES (" +
                "default, ${entity.restaurant_id}, ${entity.table}," +
                " '${entity.status.name}') RETURNING id", Int::class.java))
    }

    override fun find(key: Int): Order? {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM $TABLE_NAME WHERE id = $key LIMIT 1",
                orderMapper
        )
    }

    override fun findAll(): MutableList<Order> {
        return jdbcTemplate.query(
                "SELECT * FROM $TABLE_NAME",
                orderMapper
        )
    }

    override fun update(entity: Order): Order? {
        val newStatusStr = jdbcTemplate.queryForObject(
                "UPDATE $TABLE_NAME SET status = '${entity.status}' WHERE id = ${entity.id} RETURNING status",
                String::class.java
        )

        return entity.copy(status = OrderStatus.valueOf(newStatusStr))
    }

    override fun delete(entity: Order): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}