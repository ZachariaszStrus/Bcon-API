package com.dzik.bcon.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "system_user")
data class User (

        @Id
        @GeneratedValue
        val id: Int = 0,

        val username: String = "",

        val password: String = ""
)