package com.dzik.bcon.controller.order

import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.web.bind.annotation.*




@RestController
@RequestMapping("/orders")
class OrderController(
        val orderService: OrderService,
        val simpMessagingTemplate: SimpMessagingTemplate
) {

    @PostMapping
    fun addNewOrder(@RequestBody orderRequest: OrderRequest): ResponseEntity<Order?> {
        val order = this.orderService.addNewOrder(orderRequest)

        if(order == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)

        this.simpMessagingTemplate.convertAndSend(
                "/topic/orders/" + orderRequest.restaurant_id,
                this.orderService.getOrderListItem(order!!)
        )

        return ResponseEntity.ok(order)
    }

    @GetMapping
    fun getAll(@RequestParam status: OrderStatus?): ResponseEntity<ArrayList<OrderListItem>> {
        return ResponseEntity.ok(orderService.getOrderList(status))
    }

    @PutMapping("/{orderId}")
    fun updateStatus(
            @RequestBody newStatus: OrderStatus,
            @PathVariable orderId: Int
    ): ResponseEntity<Order?> {
        val newOrder = this.orderService.updateStatus(orderId, newStatus)

        return if(newOrder == null) ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
        else ResponseEntity.ok(newOrder)
    }
}