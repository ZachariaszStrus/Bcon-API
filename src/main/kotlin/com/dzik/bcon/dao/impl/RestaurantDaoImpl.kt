package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.restaurant.Restaurant
import org.springframework.jdbc.core.JdbcTemplate

class RestaurantDaoImpl(val jdbcTemplate: JdbcTemplate) : RestaurantDao {
    override fun create(entity: Restaurant): Restaurant? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun find(key: Int): Restaurant? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): MutableList<Restaurant> {
        return jdbcTemplate.queryForList(
                "SELECT * FROM restaurant",
                Restaurant::class.java
        )
    }

    override fun update(entity: Restaurant): Restaurant? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: Restaurant): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}