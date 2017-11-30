package com.dzik.bcon.service.firebase

import org.springframework.http.HttpEntity
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.*
import java.util.concurrent.CompletableFuture

@Service
class AndroidPushNotificationsService {

    private val FIREBASE_SERVER_KEY: String = "AAAAxHozBo0:APA91bHO-8wyUJ4CNb54vXZ9mgp24L6cBs_RZbdZZcCdgFIljl3-afBozCcX0YqfKWa_K-AiJ0Za8umqxIPq7hjeud2iBZIgIz9HwHbJgOVh6gcMI1ixh2Ezq4FTsR5UID8qyRmRyR4u"

    @Async
    fun send(entity: HttpEntity<FirebaseMessage>): CompletableFuture<FirebaseResponse> {

        val restTemplate = RestTemplate()

        val interceptors = ArrayList<ClientHttpRequestInterceptor>()
        interceptors.add(HeaderRequestInterceptor("Authorization", "key=" + FIREBASE_SERVER_KEY))
        interceptors.add(HeaderRequestInterceptor("Content-Type", "application/json"))
        restTemplate.interceptors = interceptors

        val firebaseResponse = restTemplate.postForObject("https://fcm.googleapis.com/fcm/send", entity, FirebaseResponse::class.java)

        return CompletableFuture.completedFuture(firebaseResponse)
    }

}
