package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.service.RestaurantService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
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
    fun getById(@PathVariable id: Int): ResponseEntity<RestaurantMenuResponse> {
        val restaurant = restaurantService.getRestaurantMenu(id)
        return if(restaurant != null) {
            val responseBody = RestaurantMenuResponse(restaurant)
            ResponseEntity.ok(responseBody)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
        }
    }
}
