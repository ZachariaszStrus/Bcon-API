package com.dzik.bcon.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RestaurantController {
    @RequestMapping("/env")
    fun greeting(): MutableMap<String, String>? {
        return System.getenv()
    }
}