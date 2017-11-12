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
        val user = User(
                username = "zaki",
                password = passwordEncoder.encode("1234"),
                roles = listOf(Role(name = UserRoleType.USER))
        )

        userRepository.save(user)

        save1()
        save2()
    }

    fun save1() {
        val menuItems = HashSet<MenuItem>()
        menuItems.add(MenuItem(name = "Kotlet schabowy", price = 15.99F))
        menuItems.add(MenuItem(name = "Naleśniki z pasztetem", price = 18.99F))
        menuItems.add(MenuItem(name = "Pierogi ruskie", price = 14.99F))

        var beacon = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "89fac117b149"
        )

        var restaurant = Restaurant(
                name = "Jak w domu",
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
    }

    fun save2() {
        val menuItems2 = hashSetOf(
                MenuItem(name = "Cheeseburger", price = 4.95F),
                MenuItem(name = "Fries", price = 3.50F),
                MenuItem(name = "Hot Dog", price = 4.39F)
        )

        var beacon2 = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "b37a3c9031e1"
        )

        var restaurant2 = Restaurant(
                name = "Dais'y Comfort Food",
                menuItems = menuItems2
        )

        val table2 = RestaurantTable(
                number = 4,
                beacon = beacon2,
                restaurant = restaurant2
        )

        restaurant2.tables.add(table2)

        beacon2.restaurantTable = table2

        restaurantRepository.save(restaurant2)
    }
}