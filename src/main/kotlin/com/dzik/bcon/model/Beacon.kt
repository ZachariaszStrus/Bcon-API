package com.dzik.bcon.model

import javax.persistence.*


@Entity
data class Beacon (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,

        var namespace: String = "",

        var instance: String = "",

        @OneToOne
        var restaurantTable: RestaurantTable? = null

) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Beacon

                if (id != other.id) return false

                return true
        }

        override fun hashCode(): Int {
                return id ?: 0
        }

        override fun toString(): String {
                return "Beacon(id=$id)"
        }
}