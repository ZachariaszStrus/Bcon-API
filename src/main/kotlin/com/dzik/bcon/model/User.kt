package com.dzik.bcon.model

import javax.persistence.*

@Entity
@Table(name = "system_user")
data class User (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,

        val username: String = "",

        val password: String = ""
)