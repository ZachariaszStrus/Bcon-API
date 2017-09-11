package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.MenuItem


data class RestaurantMenuResponse (
        val name: String,
        val menu: MutableList<MenuItem>
)