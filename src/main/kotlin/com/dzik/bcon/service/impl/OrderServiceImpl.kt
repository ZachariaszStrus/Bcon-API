package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.dao.OrderItemDao
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.service.OrderService

class OrderServiceImpl(private val orderDao: OrderDao, private val orderItemDao: OrderItemDao) : OrderService {
    override fun addNewOrder(orderRequest: OrderRequest): Boolean {
        val order: Order =
                orderDao.create(Order(null, orderRequest.restaurant_id, orderRequest.table)) ?: return false

        orderRequest.orderItemRequestList.forEach { (menu_id) ->
            orderItemDao.create(OrderItem(null, order.id!!, menu_id)) ?: return false
        }

        return true
    }
}