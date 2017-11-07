package com.dzik.bcon.model

import javax.persistence.*


@Entity
@Table(name = "menu_item")
data class MenuItem(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,

        val name: String = "",

        val price: Float = 0F,

        val imageUrl: String = "http://lorempixel.com/400/400/"
)