package com.dzik.bcon.controller

import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.restaurant.Restaurant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController("/restaurants")
class RestaurantController(val restaurantDao: RestaurantDao) {

    @GetMapping
    fun getAll(): MutableList<Restaurant> {
        return restaurantDao.findAll()
    }

    @GetMapping("/{id}")
    fun getById(@RequestParam id: Int): Restaurant? {
        return restaurantDao.find(id)
    }
}
