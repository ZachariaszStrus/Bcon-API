package com.dzik.bcon

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.model.Role
import com.dzik.bcon.model.User
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct


@Component
class EntityLoader(
        val restaurantRepository: RestaurantRepository,
        val userRepository: UserRepository,
        val passwordEncoder: PasswordEncoder
) {

    @PostConstruct
    fun init() {
        val menuItems = HashSet<MenuItem>()
        menuItems.add(MenuItem(name = "pica", price = 9F))
        menuItems.add(MenuItem(name = "cola", price = 77F))
        menuItems.add(MenuItem(name = "burger", price = 23F))
        menuItems.add(MenuItem(name = "fryty", price = 4F))
        menuItems.add(MenuItem(name = "pica", price = 5F))

        val restaurant = Restaurant(
                name = "U twojej mamy",
                menuItems = menuItems
        )

        restaurantRepository.save(restaurant)

        val user = User(
                username = "zaki",
                password = passwordEncoder.encode("1234"),
                roles = setOf(Role(name = "USER"))
        )

        userRepository.save(user)
    }
}