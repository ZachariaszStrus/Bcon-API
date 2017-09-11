package com.dzik.bcon.service.impl

import com.dzik.bcon.dao.MenuItemDao
import com.dzik.bcon.dao.RestaurantDao
import com.dzik.bcon.controller.restaurant.RestaurantMenuResponse
import com.dzik.bcon.service.RestaurantService
import org.springframework.stereotype.Service

@Service
class RestaurantServiceImpl(
        val restaurantDao: RestaurantDao,
        val menuItemDao: MenuItemDao
) : RestaurantService {

    override fun getRestaurantMenu(id: Int): RestaurantMenuResponse? {
        val restaurant = restaurantDao.find(id)
        if(restaurant != null) {
            val menuItems = menuItemDao.findByMenuId(restaurant.menu_id)

            return RestaurantMenuResponse(
                    restaurant.name,
                    menuItems
            )
        }
        return null
    }
}