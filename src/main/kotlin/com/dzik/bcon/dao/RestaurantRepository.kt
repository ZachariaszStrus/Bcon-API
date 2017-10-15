package com.dzik.bcon.dao

import com.dzik.bcon.model.Restaurant
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


interface RestaurantRepository : JpaRepository<Restaurant, Int>