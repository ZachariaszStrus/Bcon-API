package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.restaurant.Restaurant
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class RestaurantDaoImpl(val jdbcTemplate: JdbcTemplate) : RestaurantDao {
    val restaurantMapper = { rs: ResultSet, rn: Int ->
        Restaurant(rs.getInt("id"),rs.getString("name"),rs.getInt("menu_id"))
    }

    override fun create(entity: Restaurant): Restaurant? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun find(key: Int): Restaurant? {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM restaurant WHERE id = $key LIMIT 1",
                restaurantMapper
        )
    }

    override fun findAll(): MutableList<Restaurant> {
        return jdbcTemplate.query(
                "SELECT * FROM restaurant",
                restaurantMapper
        )
    }

    override fun update(entity: Restaurant): Restaurant? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: Restaurant): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}