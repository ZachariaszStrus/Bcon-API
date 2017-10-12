package com.dzik.bcon.controller

import com.dzik.bcon.dao.UserRepository
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.User
import org.springframework.http.ResponseEntity
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class UserController(
        val userRepository: UserRepository,
        val simpMessagingTemplate: SimpMessagingTemplate
) {

    @GetMapping
    fun getUsers(): MutableList<User>? {
        return userRepository.findAll()
    }

    @GetMapping("/{id}")
    fun sendMessage(@PathVariable id: Int): ResponseEntity<Boolean> {
        this.simpMessagingTemplate.convertAndSend(
                "/topic/orders/" + id,
                Order()
        )

        return ResponseEntity.ok(true)
    }
}