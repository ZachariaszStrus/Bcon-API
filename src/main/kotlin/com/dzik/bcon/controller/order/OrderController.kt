package com.dzik.bcon.controller.order

import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/orders")
class OrderController(val orderService: OrderService) {

    @PostMapping
    fun addNewOrder(@RequestBody orderRequest: OrderRequest): Boolean {
        return this.orderService.addNewOrder(orderRequest)
    }

    @GetMapping
    fun getAll(@RequestParam status: OrderStatus?): ArrayList<OrderListItem> {
        return orderService.getOrderList(status)
    }
}