package com.dzik.bcon.controller

import com.dzik.bcon.repository.UserRepository
import com.dzik.bcon.service.firebase.AndroidPushNotificationsService
import com.dzik.bcon.service.firebase.FirebaseMessage
import com.dzik.bcon.service.firebase.FirebaseResponse
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.CompletableFuture


@RestController
@RequestMapping("/")
class TestController(
        val userRepository: UserRepository,
        val androidPushNotificationsService: AndroidPushNotificationsService
) : BaseController(){

    @RequestMapping(value = "/send", method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
    fun send(): ResponseEntity<FirebaseResponse?> {

        val notification = FirebaseMessage(
                to = "eskqBU9x7Fo:APA91bHmd3gHVX5rMyUNb7x74DERFz-es2OKiClRtpchD9NvHjDzqwsZcbfxs7QbKowqr-ohehIdrCq-9S87p88EOG9t06bSsaPhTGDRB6Dx3WVrkZC_Bt6obyuVJ5lOZv9OW8lXqvWp",
                title = "hej",
                body = "hej body"
        )

        val request = HttpEntity(notification)

        val pushNotification = androidPushNotificationsService.send(request)
        CompletableFuture.allOf(pushNotification).join()

        try {
            val firebaseResponse = pushNotification.get()
            return ok(firebaseResponse)

        } catch (e: Exception) {
            e.printStackTrace()
        }

        return notFound()
    }
}