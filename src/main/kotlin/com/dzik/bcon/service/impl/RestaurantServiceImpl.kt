package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse
import com.dzik.bcon.repository.MenuItemRepository
import com.dzik.bcon.repository.RestaurantRepository
import com.dzik.bcon.service.RestaurantService
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class RestaurantServiceImpl(
        val restaurantRepository: RestaurantRepository,
        val menuItemRepository: MenuItemRepository
) : RestaurantService {

    override fun getRestaurantMenu(id: Int): RestaurantMenuResponse? {
        val restaurant = restaurantRepository.getOne(id)
        val menuItems = menuItemRepository.findByMenuId(restaurant.menuId)

        return RestaurantMenuResponse(
                restaurant.name,
                menuItems
        )
    }
}