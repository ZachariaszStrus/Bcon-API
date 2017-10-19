package com.dzik.bcon.service

import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse
import com.dzik.bcon.model.Restaurant


interface RestaurantService {
    fun getRestaurantMenu(id: Int): Restaurant?
}