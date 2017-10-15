package com.dzik.bcon.dao

import com.dzik.bcon.model.User
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional


interface UserRepository : JpaRepository<User, Int>