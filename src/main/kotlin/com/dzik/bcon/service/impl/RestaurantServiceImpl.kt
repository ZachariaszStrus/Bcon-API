package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse
import com.dzik.bcon.dao.MenuItemRepository
import com.dzik.bcon.dao.RestaurantRepository
import com.dzik.bcon.service.RestaurantService
import org.springframework.stereotype.Service

@Service
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