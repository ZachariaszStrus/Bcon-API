package com.dzik.bcon.dao

import com.dzik.bcon.restaurant.Restaurant
import com.dzik.bcon.utils.database.Dao
import org.springframework.stereotype.Repository

@Repository
interface RestaurantDao : Dao<Int, Restaurant>