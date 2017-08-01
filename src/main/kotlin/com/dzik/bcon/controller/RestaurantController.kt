package com.dzik.bcon.controller

import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.restaurant.Restaurant
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/restaurants")
class RestaurantController(val restaurantDao: RestaurantDao) {
    private val log = LoggerFactory.getLogger(RestaurantController::class.java)

    @GetMapping
    fun getAll(): MutableList<Restaurant> {
        log.info("Restaurant getAll")
        return restaurantDao.findAll()
    }
}
