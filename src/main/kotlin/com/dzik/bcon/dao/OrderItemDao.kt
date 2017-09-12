package com.dzik.bcon.dao

import com.dzik.bcon.model.OrderItem
import com.dzik.bcon.utils.database.Dao


interface OrderItemDao : Dao<Int, OrderItem>