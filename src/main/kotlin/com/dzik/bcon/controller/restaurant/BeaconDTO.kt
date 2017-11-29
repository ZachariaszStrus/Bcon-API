package com.dzik.bcon.controller.restaurant

import com.dzik.bcon.model.Beacon


data class BeaconDTO (
        val id: Int? = null,
        val namespace: String = "",
        val instance: String = "",
        var tableId: Int? = null
) {
    constructor(beacon: Beacon) : this(
            id = beacon.id,
            namespace = beacon.namespace,
            instance = beacon.instance,
            tableId = beacon.restaurantTable?.id
    )
}