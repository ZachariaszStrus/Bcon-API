package com.dzik.bcon.model

import com.dzik.bcon.controller.restaurant.BeaconDTO
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*


@Entity
data class Beacon (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,

        var namespace: String = "",

        @Column(unique = true)
        var instance: String = "",

        @JsonIgnore
        @OneToOne
        var restaurantTable: RestaurantTable? = null

) {
        constructor(beaconDTO: BeaconDTO) : this(
                namespace = beaconDTO.nameSpace,
                instance = beaconDTO.instance
        )

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