package com.dzik.bcon.dao

import com.dzik.bcon.model.MenuItem
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


interface MenuItemRepository : JpaRepository<MenuItem, Int> {
    fun findByMenuId(menuId: Int): MutableList<MenuItem>
}