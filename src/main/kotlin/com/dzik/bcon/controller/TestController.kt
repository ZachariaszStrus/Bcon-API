package com.dzik.bcon.controller

import com.dzik.bcon.dao.UserRepository
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.User
import org.springframework.http.ResponseEntity
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/test")
class TestController(
        val userRepository: UserRepository,
        val simpMessagingTemplate: SimpMessagingTemplate
) {

    @GetMapping
    fun getUsers(): MutableList<User>? {
        return userRepository.findAll()
    }

    @PostMapping
    fun getUsers(@RequestBody user: User): User {
        return userRepository.save(user)
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