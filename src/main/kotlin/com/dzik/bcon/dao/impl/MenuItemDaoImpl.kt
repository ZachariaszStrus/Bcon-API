package com.dzik.bcon.dao.impl

import com.dzik.bcon.dao.MenuItemDao
import com.dzik.bcon.model.MenuItem
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class MenuItemDaoImpl(private val jdbcTemplate: JdbcTemplate) : MenuItemDao {
    val menuItemMapper = { rs: ResultSet, rn: Int ->
        MenuItem(rs.getInt("id"), rs.getString("name"), rs.getFloat("price"), rs.getInt("menu_id"))
    }

    override fun findByMenuId(menu_id: Int): MutableList<MenuItem> {
        return jdbcTemplate.query(
                "SELECT * FROM menu_item WHERE menu_id = $menu_id",
                menuItemMapper
        )
    }

    override fun create(entity: MenuItem): MenuItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun find(key: Int): MenuItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): MutableList<MenuItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(entity: MenuItem): MenuItem? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}