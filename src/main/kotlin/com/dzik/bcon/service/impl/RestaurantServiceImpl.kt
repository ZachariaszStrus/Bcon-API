package com.dzik.bcon.service.impl

import com.dzik.bcon.model.Restaurant
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

    override fun getRestaurantMenu(id: Int): Restaurant? {
        return restaurantRepository.getOne(id)
    }
}