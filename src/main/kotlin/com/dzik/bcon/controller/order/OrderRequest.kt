package com.dzik.bcon.controller.order

data class OrderRequest (

        val beaconUID: BeaconUID = BeaconUID(),

        val orderItemRequestList: List<OrderItemRequest> = emptyList(),

        val fcmToken: String = ""
)