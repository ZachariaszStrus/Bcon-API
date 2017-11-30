package com.dzik.bcon.service.firebase

data class FirebaseMessage(
        val to: String,
        val notification: FirebaseNotification
) {
    constructor(to: String, title: String, body: String) : this (
            to = to,
            notification = FirebaseNotification(
                    title = title,
                    body = body
            )
    )

    data class FirebaseNotification(
            val title: String,
            val body: String
    )
}

