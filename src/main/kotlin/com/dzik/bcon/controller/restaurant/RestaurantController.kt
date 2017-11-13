package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.controller.BaseController
import com.dzik.bcon.service.RestaurantService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/restaurants")
class RestaurantController(
        val restaurantService: RestaurantService
) : BaseController() {

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): ResponseEntity<RestaurantMenuResponse?> {
        val restaurant = restaurantService.getRestaurantMenu(id)
        return if(restaurant != null) {
            val responseBody = RestaurantMenuResponse(restaurant)
            ok(responseBody)
        } else {
            notFound()
        }
    }

    @GetMapping()
    fun getByBeacon(
            @RequestParam beaconNamespace: String,
            @RequestParam beaconInstance: String
    ): ResponseEntity<RestaurantMenuResponse?> {
        val restaurant = restaurantService
                .getRestaurantMenuByBeacon(beaconNamespace, beaconInstance)
        return if(restaurant != null) {
            val responseBody = RestaurantMenuResponse(restaurant)
            ok(responseBody)
        } else {
            notFound()
        }
    }
}
