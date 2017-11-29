package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.RestaurantTable


data class TableDTO (

        val number: Int = 0,

        val name: String = "RestaurantTable",

        var beaconId: Int = 0
) {
    constructor(restaurantTable: RestaurantTable) : this(
            number = restaurantTable.number,
            name = restaurantTable.name,
            beaconId = restaurantTable.beacon.id!!
    )
}