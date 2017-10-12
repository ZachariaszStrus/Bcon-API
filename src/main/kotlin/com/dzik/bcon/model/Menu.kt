package com.dzik.bcon.model

import javax.persistence.*


@Entity
@Table(name = "menu")
data class Menu (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int
)
