package com.dzik.bcon.controller.order

import com.dzik.bcon.controller.BaseController
import com.dzik.bcon.model.utils.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/orders")
class OrderController(
        val orderService: OrderService,
        val simpMessagingTemplate: SimpMessagingTemplate
) : BaseController() {

    @PostMapping
    fun addNewOrder(@RequestBody orderRequest: OrderRequest): ResponseEntity<GetOrderListResponse>? {
        val order = this.orderService.addNewOrder(orderRequest)

        if(order == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)

        this.simpMessagingTemplate.convertAndSend(
                "/topic/orders/" + orderRequest.restaurant_id,
                GetOrderListResponse(order)
        )

        return ResponseEntity.ok(GetOrderListResponse(order))
    }

    @GetMapping
    @PreAuthorize("hasRole('RESTAURANT_EMPLOYEE')")
    fun getAll(@RequestParam status: OrderStatus?): ResponseEntity<List<GetOrderListResponse>> {
        val orders = orderService.getOrderList(status)
        return ResponseEntity.ok(orders.map { o -> GetOrderListResponse(o) })
    }

    @PutMapping("/{orderId}")
    @PreAuthorize("hasRole('RESTAURANT_EMPLOYEE')")
    fun updateStatus(
            @RequestBody newStatus: OrderStatus,
            @PathVariable orderId: Int
    ): ResponseEntity<GetOrderListResponse>? {
        val newOrder = this.orderService.updateStatus(orderId, newStatus)

        return if(newOrder == null) ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
        else ResponseEntity.ok(GetOrderListResponse(newOrder))
    }

}