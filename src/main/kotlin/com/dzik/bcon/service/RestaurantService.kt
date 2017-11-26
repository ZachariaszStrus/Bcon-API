package com.dzik.bcon.service

import com.dzik.bcon.model.Restaurant
import org.springframework.security.access.prepost.PreAuthorize


interface RestaurantService {

    fun getRestaurantMenu(id: Int): Restaurant?

    fun getRestaurantMenuByBeacon(
            beaconNamespace: String,
            beaconInstance: String
    ): Restaurant?

    @PreAuthorize("isAuthenticated()")
    fun getRestaurant(): Restaurant?
}