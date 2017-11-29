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

    override fun getTables(): List<TableDTO> {
        val restaurant = getRestaurantByPrincipal() ?: return emptyList()

        return restaurant.tables.map { TableDTO(it) }
    }

    override fun getBeacons(): List<BeaconDTO> {
        val restaurant = getRestaurantByPrincipal() ?: return emptyList()

        return beaconRepository.findByRestaurant(restaurant)
                .map { BeaconDTO(it) }
    }

    override fun addTable(tableDTO: TableDTO): RestaurantTable? {
        val restaurant = getRestaurantByPrincipal() ?: return null

        val beacon = beaconRepository.findOne(tableDTO.beaconId) ?: return null

        if(beacon.restaurant != restaurant || beacon.restaurantTable != null) return null

        val table = RestaurantTable(
                number = tableDTO.number,
                name = tableDTO.name,
                beacon = beacon,
                restaurant = restaurant
        )

        beacon.restaurantTable = table

        restaurant.tables.add(table)

        return restaurantRepository.save(restaurant).tables.firstOrNull { it.number == tableDTO.number }
    }

    override fun addBeacon(beaconDTO: BeaconDTO): Beacon? {
        val restaurant = getRestaurantByPrincipal() ?: return null

        return beaconRepository.save(Beacon(beaconDTO, restaurant))
    }

    override fun updateMenu(menuItems: Set<MenuItem>): Restaurant? {
        val restaurant = getRestaurantByPrincipal() ?: return null

        restaurant.menuItems = menuItems

        return restaurantRepository.save(restaurant)
    }

    override fun getRestaurant(): Restaurant? {
        return getRestaurantByPrincipal()
    }

    override fun getRestaurantMenu(id: Int): Restaurant? {
        return restaurantRepository.getOne(id)
    }

    override fun getRestaurantMenuByBeacon(beaconNamespace: String, beaconInstance: String): Restaurant? {
        val beacon = beaconRepository
                .findByNamespaceAndInstance(beaconNamespace, beaconInstance)

        return beacon?.restaurantTable?.restaurant
    }

    private fun getRestaurantByPrincipal(): Restaurant? {
        val userDetails = SecurityContextHolder.getContext().authentication.principal
                as CustomUserDetails

        val restaurantRole = userDetails.user.roles
                .firstOrNull { it.name == UserRoleType.RESTAURANT_EMPLOYEE }
                ?: return null

        return restaurantRepository.getOne(restaurantRole.restaurantId)
    }
}