package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant


data class RestaurantMenuResponse (
        val id: Int,
        val name: String,
        val menu: Set<MenuItem>
) {
    constructor(restaurant: Restaurant) : this (
            restaurant.id,
            restaurant.name,
            restaurant.menuItems
    )
}