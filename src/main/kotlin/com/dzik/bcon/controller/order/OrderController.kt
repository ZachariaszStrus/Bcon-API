package com.dzik.bcon.controller.order

import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/orders")
class OrderController(val orderService: OrderService) {

    @GetMapping
    fun getAll(@RequestParam status: OrderStatus?): ArrayList<OrderListItem> {
        return orderService.getOrderList(status)
    }
}