package com.dzik.bcon.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping




@RestController
class RestaurantController {
    @RequestMapping("/")
    fun greeting(): String {
        return "Hello Bcon Spring"
    }
}