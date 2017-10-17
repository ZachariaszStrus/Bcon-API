package com.dzik.bcon.model

import javax.persistence.*

@Entity
@Table(name = "role")
data class Role (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,

        @Column(name = "role_name")
        val name: String = ""
)