package com.dzik.bcon.controller.user

import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController(
        val userService: UserService
) {

    @PostMapping
    fun register(@RequestBody userPost: UserPost): ResponseEntity<Boolean> {
        return if(userService.create(userPost, listOf(UserRoleType.USER)) != null) {
            ResponseEntity.ok(true)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
        }
    }
}