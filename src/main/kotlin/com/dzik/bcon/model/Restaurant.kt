package com.dzik.bcon.model

import javax.persistence.*


@Entity
@Table(name = "restaurant")
data class Restaurant (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        var name: String = "",

        @OneToMany(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name="restaurant_id")
        val menuItems: Set<MenuItem> = HashSet()
)

