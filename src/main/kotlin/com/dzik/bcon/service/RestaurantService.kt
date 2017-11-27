package com.dzik.bcon.service

import com.dzik.bcon.controller.restaurant.BeaconDTO
import com.dzik.bcon.controller.restaurant.TableDTO
import com.dzik.bcon.model.Beacon
import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.model.RestaurantTable
import org.springframework.security.access.prepost.PreAuthorize


interface RestaurantService {

    @PreAuthorize("isAuthenticated()")
    fun addTable(tableDTO: TableDTO): RestaurantTable?

    @PreAuthorize("isAuthenticated()")
    fun addBeacon(beaconDTO: BeaconDTO): Beacon?

    @PreAuthorize("isAuthenticated()")
    fun updateMenu(menuItems: Set<MenuItem>): Restaurant?

    fun getRestaurantMenu(id: Int): Restaurant?

    fun getRestaurantMenuByBeacon(
            beaconNamespace: String,
            beaconInstance: String
    ): Restaurant?

    @PreAuthorize("isAuthenticated()")
    fun getRestaurant(): Restaurant?
}