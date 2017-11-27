package com.dzik.bcon.model

import javax.persistence.*


@Entity
data class Restaurant (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        var name: String = "",

        @OneToMany(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name="restaurant_id")
        var menuItems: Set<MenuItem> = HashSet(),

        @OneToMany(mappedBy = "restaurant", cascade = arrayOf(CascadeType.ALL))
        val tables: MutableList<RestaurantTable> = mutableListOf(),

        val imageUrl: String = "http://lorempixel.com/400/400/"
) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Restaurant

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "Restaurant(id=$id)"
    }
}

