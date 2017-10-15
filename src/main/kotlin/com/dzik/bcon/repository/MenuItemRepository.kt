package com.dzik.bcon.repository

import com.dzik.bcon.model.MenuItem
import org.springframework.data.jpa.repository.JpaRepository


interface MenuItemRepository : JpaRepository<MenuItem, Int> {
    fun findByMenuId(menuId: Int): MutableList<MenuItem>
}