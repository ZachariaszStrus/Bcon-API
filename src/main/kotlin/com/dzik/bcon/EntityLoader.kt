package com.dzik.bcon

import com.dzik.bcon.model.*
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.repository.BeaconRepository
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct


@Component
class EntityLoader(
        val restaurantRepository: RestaurantRepository,
        val userRepository: UserRepository,
        val passwordEncoder: PasswordEncoder,
        val beaconRepository: BeaconRepository
) {

    @PostConstruct
    fun init() {
        val menuItems = HashSet<MenuItem>()
        menuItems.add(MenuItem(name = "pica", price = 9F))
        menuItems.add(MenuItem(name = "cola", price = 77F))
        menuItems.add(MenuItem(name = "burger", price = 23F))
        menuItems.add(MenuItem(name = "fryty", price = 4F))
        menuItems.add(MenuItem(name = "pica", price = 5F))

        var beacon = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "89fac117b149"
        )

        var restaurant = Restaurant(
                name = "U twojej mamy",
                menuItems = menuItems
        )

        val table = RestaurantTable(
                number = 4,
                beacon = beacon,
                restaurant = restaurant
        )

        restaurant.tables.add(table)

        beacon.restaurantTable = table

        restaurantRepository.save(restaurant)

        val user = User(
                username = "zaki",
                password = passwordEncoder.encode("1234"),
                roles = listOf(Role(name = UserRoleType.USER))
        )

        userRepository.save(user)
    }
}