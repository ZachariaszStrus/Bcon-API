package com.dzik.bcon.service

import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse


interface RestaurantService {
    fun getRestaurantMenu(id: Int): RestaurantMenuResponse?
}