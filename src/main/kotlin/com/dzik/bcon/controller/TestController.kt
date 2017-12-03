package com.dzik.bcon.controller

import com.dzik.bcon.repository.UserRepository
import com.dzik.bcon.service.firebase.AndroidPushNotificationsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class TestController(
        val userRepository: UserRepository,
        val androidPushNotificationsService: AndroidPushNotificationsService
) : BaseController(){

    @GetMapping
    fun a(): String {
        return "chuj"
    }


}