package com.dzik.bcon.dao

import com.dzik.bcon.model.Order
import com.dzik.bcon.utils.database.Dao


interface OrderDao : Dao<Int, Order>