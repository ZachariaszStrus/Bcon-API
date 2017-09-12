package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.order.OrderListItem
import com.dzik.bcon.controller.order.OrderMenuItem
import com.dzik.bcon.dao.MenuItemDao
import com.dzik.bcon.dao.OrderDao
import com.dzik.bcon.dao.OrderItemDao
import com.dzik.bcon.model.OrderStatus
import com.dzik.bcon.service.OrderService
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
        val orderDao: OrderDao,
        val orderItemDao: OrderItemDao,
        val menuItemDao: MenuItemDao
) : OrderService {
    override fun getOrderList(status: OrderStatus?): ArrayList<OrderListItem> {
        val result = arrayListOf<OrderListItem>()

        val orders =
                if(status == null) { orderDao.findAll() }
                else { orderDao.findByStatus(status) }

        orders.forEach { order ->
            val orderMenuItems = orderItemDao
                    .findByOrderId(order.id)
                    .map { orderItem ->
                        val menuItem = menuItemDao.find(orderItem.menu_item_id)
                        if(menuItem != null) OrderMenuItem(menuItem.name, menuItem.price)
                        else null
                    } as ArrayList<OrderMenuItem?>
            result.add(
                    OrderListItem(
                            order.id,
                            order.table,
                            orderMenuItems
                    )
            )
        }

        return result
    }
}