package com.dzik.bcon.controller

import com.dzik.bcon.repository.UserRepository
import com.dzik.bcon.model.Order
import com.dzik.bcon.model.User
import org.springframework.http.ResponseEntity
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/")
class TestController(
        val userRepository: UserRepository
) {

    @GetMapping("/")
    fun home(): MutableMap<String, String>? {
        return System.getenv()
    }

    @GetMapping("/private")
    fun private(): Any? {
        return SecurityContextHolder.getContext().authentication.principal
    }
}