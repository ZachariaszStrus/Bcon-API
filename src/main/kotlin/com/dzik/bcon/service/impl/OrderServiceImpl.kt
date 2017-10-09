package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.order.OrderListItem
import com.dzik.bcon.controller.order.OrderMenuItem
import com.dzik.bcon.controller.order.OrderRequest
import com.dzik.bcon.dao.MenuItemDao
import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.dao.OrderItemDao
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
        val orderDao: OrderDao,
        val orderItemDao: OrderItemDao,
        val menuItemDao: MenuItemDao
) : OrderService {
    override fun updateStatus(orderId: Int, newStatus: OrderStatus): Order? {
        val order = this.orderDao.find(orderId) ?: return null
        return this.orderDao.update(order.copy(status = newStatus))
    }

    override fun getOrderList(status: OrderStatus?): ArrayList<OrderListItem> {
        val result = arrayListOf<OrderListItem>()

        val orders =
                if(status == null) { orderDao.findAll() }
                else { orderDao.findByStatus(status) }

        orders.forEach { result.add(getOrderListItem(it)) }

        return result
    }

    override fun getOrderListItem(order: Order): OrderListItem {
        val orderMenuItems = orderItemDao
                .findByOrderId(order.id!!)
                .map { orderItem ->
                    val menuItem = menuItemDao.find(orderItem.menu_item_id)
                    if(menuItem != null) OrderMenuItem(menuItem.name, menuItem.price)
                    else null
                } as ArrayList<OrderMenuItem?>

        return OrderListItem(
                        order.id,
                        order.table,
                        orderMenuItems
                )
    }

    override fun addNewOrder(orderRequest: OrderRequest): Order? {
        val order: Order =
                orderDao.create(Order(null, orderRequest.restaurant_id, orderRequest.table))
                        ?: return null

        orderRequest.orderItemRequestList.forEach { (menu_id) ->
            orderItemDao.create(OrderItem(null, order.id!!, menu_id)) ?: return null
        }

        return order
    }
}