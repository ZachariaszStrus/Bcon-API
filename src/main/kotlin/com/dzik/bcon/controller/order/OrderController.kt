package com.dzik.bcon.controller.order
import com.dzik.bcon.service.OrderService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/orders")
class OrderController(val orderService: OrderService) {

    @PostMapping
    fun addNewOrder(orderRequest: OrderRequest): Boolean {
        return this.orderService.addNewOrder(orderRequest)
    }

}