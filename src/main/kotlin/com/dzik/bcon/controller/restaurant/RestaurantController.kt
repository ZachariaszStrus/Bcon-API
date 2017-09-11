package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.service.RestaurantService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController




@RestController
@RequestMapping("/restaurants")
class RestaurantController(val restaurantService: RestaurantService) {

//    @GetMapping
//    fun getAll(): MutableList<Restaurant> {
//        return restaurantService.findAll()
//    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): RestaurantMenuResponse? {
        return restaurantService.getRestaurantMenu(id)
    }
}
