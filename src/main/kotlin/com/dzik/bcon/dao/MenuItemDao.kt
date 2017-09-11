package com.dzik.bcon.dao

import com.dzik.bcon.model.MenuItem
import com.dzik.bcon.utils.database.Dao


interface MenuItemDao : Dao<Int, MenuItem> {
    fun findByMenuId(menu_id: Int): MutableList<MenuItem>
}