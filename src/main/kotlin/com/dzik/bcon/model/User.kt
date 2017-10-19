package com.dzik.bcon.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "system_user")
data class User (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,

        val username: String = "",

        val password: String = "",

        @OneToMany(fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name="user_id")
        val roles: List<Role> = ArrayList()
) : Serializable