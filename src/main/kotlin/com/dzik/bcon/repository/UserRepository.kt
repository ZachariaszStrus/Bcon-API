package com.dzik.bcon.repository

import com.dzik.bcon.model.User
import org.springframework.data.jpa.repository.JpaRepository


interface UserRepository : JpaRepository<User, Int> {
    fun findByUsername(username: String): User
}