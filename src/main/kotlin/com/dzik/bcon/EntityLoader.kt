package com.dzik.bcon

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.repository.RestaurantRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct


@Component
class EntityLoader(
        val restaurantRepository: RestaurantRepository
) {

    @PostConstruct
    fun init() {
        val menuItem = MenuItem(name = "pica", price = 9F)

        val restaurant = Restaurant(
                name = "U twojej mamy",
                menuItems = setOf(menuItem)
        )

        restaurantRepository.save(restaurant)
    }
}