package com.dzik.bcon.repository

import com.dzik.bcon.model.Restaurant
import org.springframework.data.jpa.repository.JpaRepository


interface RestaurantRepository : JpaRepository<Restaurant, Int>