package com.dzik.bcon.service.impl

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.controller.restaurant.BeaconDTO
import com.dzik.bcon.controller.restaurant.TableDTO
import com.dzik.bcon.model.Beacon
import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.model.Restaurant
import com.dzik.bcon.model.RestaurantTable
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.repository.BeaconRepository
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.service.RestaurantService
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class RestaurantServiceImpl(
        val restaurantRepository: RestaurantRepository,
        val beaconRepository: BeaconRepository
) : RestaurantService {
    override fun addTable(tableDTO: TableDTO): RestaurantTable? {
        val restaurant = getRestaurant() ?: return null

        val beacon = beaconRepository.findOne(tableDTO.beaconId) ?: return null

        restaurant.tables.add(RestaurantTable(
                number = tableDTO.number,
                name = tableDTO.name,
                beacon = beacon,
                restaurant = restaurant
        ))

        return restaurantRepository.save(restaurant).tables.firstOrNull { it.number == tableDTO.number }
    }

    override fun addBeacon(beaconDTO: BeaconDTO): Beacon? {
        return beaconRepository.save(Beacon(beaconDTO))
    }

    override fun updateMenu(menuItems: Set<MenuItem>): Restaurant? {
        val restaurant = getRestaurant() ?: return null

        restaurant.menuItems = menuItems

        return restaurantRepository.save(restaurant)
    }

    override fun getRestaurant(): Restaurant? {
        val userDetails = SecurityContextHolder.getContext().authentication.principal
                as CustomUserDetails
        val restaurantRole = userDetails.user.roles
                .firstOrNull { it.name == UserRoleType.RESTAURANT_EMPLOYEE }

        return if(restaurantRole != null) {
            return restaurantRepository.getOne(restaurantRole.restaurantId)
        } else {
            null
        }
    }

    override fun getRestaurantMenu(id: Int): Restaurant? {
        return restaurantRepository.getOne(id)
    }

    override fun getRestaurantMenuByBeacon(beaconNamespace: String, beaconInstance: String): Restaurant? {
        val beacon = beaconRepository
                .findByNamespaceAndInstance(beaconNamespace, beaconInstance)

        return beacon?.restaurantTable?.restaurant
    }
}