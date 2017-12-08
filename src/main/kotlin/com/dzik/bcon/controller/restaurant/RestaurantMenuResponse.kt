package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.model.utils.PaymentOption


data class RestaurantMenuResponse (
        val id: Int,
        val name: String,
        val menu: Set<MenuItem>,
        val paymentOptions: MutableList<PaymentOption>,
        val imageUrl: String
) {
    constructor(restaurant: Restaurant) : this (
            id = restaurant.id,
            name = restaurant.name,
            menu = restaurant.menuItems,
            imageUrl = restaurant.imageUrl,
            paymentOptions = restaurant.paymentOptions
    )
}