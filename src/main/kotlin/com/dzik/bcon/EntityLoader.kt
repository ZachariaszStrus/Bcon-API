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
        val r1 = save1()
        val r2 = save2()
        val r3 = save3()

        val user = User(
                username = "zaki",
                password = passwordEncoder.encode("1234"),
                roles = listOf(
                        Role(
                                name = UserRoleType.RESTAURANT_EMPLOYEE,
                                restaurantId = r1?.id
                        )
                )
        )

        val user2 = User(
                username = "kuba",
                password = passwordEncoder.encode("1234"),
                roles = listOf(
                        Role(
                                name = UserRoleType.RESTAURANT_EMPLOYEE,
                                restaurantId = r2?.id
                        )
                )
        )

        val user3 = User(
                username = "dawid",
                password = passwordEncoder.encode("1234"),
                roles = listOf(
                        Role(
                                name = UserRoleType.RESTAURANT_EMPLOYEE,
                                restaurantId = r3?.id
                        )
                )
        )

        userRepository.save(user)
        userRepository.save(user2)
        userRepository.save(user3)
    }

    fun save1(): Restaurant? {
        val menuItems = HashSet<MenuItem>()
        menuItems.add(MenuItem(name = "Kotlet schabowy", price = 15.99F, imageUrl = "http://lorempixel.com/400/400/food/"))
        menuItems.add(MenuItem(name = "Naleśniki z pasztetem", price = 18.99F, imageUrl = "http://lorempixel.com/401/401/food/"))
        menuItems.add(MenuItem(name = "Pierogi ruskie", price = 14.99F, imageUrl = "http://lorempixel.com/402/402/food/"))

        var restaurant = Restaurant(
                name = "Jak w domu",
                menuItems = menuItems,
                imageUrl = "http://lorempixel.com/1067/600/food/"
        )

        // Beacon 1 / table 1

        var beacon = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "89fac117b149",
                restaurant = restaurant
        )

        val table = RestaurantTable(
                number = 1,
                beacon = beacon,
                restaurant = restaurant
        )

        beacon.restaurantTable = table

        restaurant.tables.add(table)

        return restaurantRepository.save(restaurant)
    }

    fun save2(): Restaurant? {
        val menuItems2 = hashSetOf(
                MenuItem(name = "Cheeseburger", price = 4.95F, imageUrl = "http://lorempixel.com/403/403/food/"),
                MenuItem(name = "Fries", price = 3.50F, imageUrl = "http://lorempixel.com/404/404/food/"),
                MenuItem(name = "Hot Dog", price = 4.39F, imageUrl = "http://lorempixel.com/405/405/food/")
        )

        var restaurant2 = Restaurant(
                name = "Dais'y Comfort Food",
                menuItems = menuItems2,
                imageUrl = "http://lorempixel.com/1067/600/food/"
        )

        var beacon2 = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "b37a3c9031e1",
                restaurant = restaurant2
        )

        val table2 = RestaurantTable(
                number = 4,
                beacon = beacon2,
                restaurant = restaurant2
        )

        restaurant2.tables.add(table2)

        beacon2.restaurantTable = table2

        return restaurantRepository.save(restaurant2)
    }

    fun save3(): Restaurant? {
        val menuItems = HashSet<MenuItem>()
        menuItems.add(MenuItem(name = "Pizza", price = 20.99F, imageUrl = "http://lorempixel.com/405/405/food/"))
        menuItems.add(MenuItem(name = "Mom's spaghetti", price = 14.99F, imageUrl = "http://lorempixel.com/404/404/food/"))
        menuItems.add(MenuItem(name = "Pasta", price = 14.99F, imageUrl = "http://lorempixel.com/403/403/food/"))

        var restaurant = Restaurant(
                name = "Italiano",
                menuItems = menuItems,
                imageUrl = "http://lorempixel.com/1067/600/food/"
        )

        // Beacon 2 / table 2

        var beacon2 = Beacon(
                namespace = "edd1ebeac04e5defa017",
                instance = "66a3678ef96b",
                restaurant = restaurant
        )

        val table2 = RestaurantTable(
                number = 2,
                beacon = beacon2,
                restaurant = restaurant
        )

        beacon2.restaurantTable = table2

        restaurant.tables.add(table2)

        return restaurantRepository.save(restaurant)
    }
}