package com.dzik.bcon.controller

import com.dzik.bcon.model.MenuItem
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RestaurantController(val jdbcTemplate: JdbcTemplate) {
    private val log = LoggerFactory.getLogger(RestaurantController::class.java)


    @RequestMapping("/env")
    fun greeting(): MutableList<MenuItem>? {
        val menuItem = jdbcTemplate.query(
                "SELECT * FROM menu_item")
        { rs, rowNum ->
            MenuItem(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getFloat("price"),
                    rs.getInt("menu_id")
            )
        }
        return menuItem
    }
}
