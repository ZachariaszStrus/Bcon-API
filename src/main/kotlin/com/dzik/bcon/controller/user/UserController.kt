package com.dzik.bcon.controller.user

import com.dzik.bcon.controller.BaseController
import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.service.RestaurantService
import com.dzik.bcon.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/user")
class UserController(
        val userService: UserService,
        val restaurantService: RestaurantService
) : BaseController() {

    @GetMapping("/restaurant")
    fun getByUser(): ResponseEntity<RestaurantMenuResponse?> {
        val restaurant = restaurantService.getRestaurant()
        return if(restaurant != null) {
            ok(RestaurantMenuResponse(restaurant))
        } else {
            notFound()
        }
    }

    @PostMapping
    fun register(@RequestBody userPost: UserPost): ResponseEntity<Boolean> {
        return if(userService.create(userPost, listOf(UserRoleType.USER)) != null) {
            ResponseEntity.ok(true)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
        }
    }
}