package com.dzik.bcon.service.impl

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.model.Restaurant
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