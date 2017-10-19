package com.dzik.bcon.controller

import com.dzik.bcon.repository.UserRepository
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class TestController(
        val userRepository: UserRepository
) {

    @GetMapping("/test")
    @PreAuthorize("hasRole('ADMIN')")
    fun home(): MutableMap<String, String>? {
        return System.getenv()
    }

    @GetMapping("/hello")
    @PreAuthorize("hasRole('USER')")
    fun hello(): String {
        return "hello"
    }

    @GetMapping("/private")
    fun private(): Any? {
        return SecurityContextHolder.getContext().authentication.principal
    }
}