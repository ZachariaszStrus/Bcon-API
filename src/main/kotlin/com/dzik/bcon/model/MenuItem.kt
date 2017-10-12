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

        @Column(name = "menu_id")
        val menuId: Int = 0
)