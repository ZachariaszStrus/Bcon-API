package com.dzik.bcon.repository

import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.model.RestaurantTable
import org.springframework.data.jpa.repository.JpaRepository


interface TableRepository : JpaRepository<RestaurantTable, Int> {
    fun findByNumberAndRestaurant(number: Int, restaurant: Restaurant): RestaurantTable
}