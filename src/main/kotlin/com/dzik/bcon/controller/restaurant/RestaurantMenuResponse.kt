package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant


data class RestaurantMenuResponse (
        val name: String,
        val menu: Set<MenuItem>
) {
    constructor(restaurant: Restaurant) : this (
            restaurant.name,
            restaurant.menuItems
    )
}