package com.dzik.bcon.service

import com.dzik.bcon.model.Restaurant


interface RestaurantService {

    fun getRestaurantMenu(id: Int): Restaurant?

    fun getRestaurantMenuByBeacon(
            beaconNamespace: String,
            beaconInstance: String
    ): Restaurant?
}