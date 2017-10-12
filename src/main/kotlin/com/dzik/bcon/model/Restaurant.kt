package com.dzik.bcon.model

import javax.persistence.*


@Entity
@Table(name = "restaurant")
data class Restaurant (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        var name: String = "",

        @Column(name = "menu_id")
        var menuId: Int = 0
)

