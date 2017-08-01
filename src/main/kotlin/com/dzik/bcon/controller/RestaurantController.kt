package com.dzik.bcon.controller

import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.restaurant.Restaurant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController




@RestController
@RequestMapping("/restaurants")
class RestaurantController(val restaurantDao: RestaurantDao) {

    @GetMapping
    fun getAll(): MutableList<Restaurant> {
        return restaurantDao.findAll()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): Restaurant? {
        return restaurantDao.find(id)
    }
}
