package com.dzik.bcon.controller

import com.dzik.bcon.dao.UserRepository
import com.dzik.bcon.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserController(
        val userRepository: UserRepository
) {

    @GetMapping
    fun getUsers(): MutableList<User>? {
        return userRepository.findAll()
    }
}