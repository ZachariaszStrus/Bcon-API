package com.dzik.bcon.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*


@Entity
data class RestaurantTable(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,

        val number: Int = 0,

        val name: String = "RestaurantTable",

        @OneToOne(mappedBy = "restaurantTable", cascade = [(CascadeType.ALL)])
        var beacon: Beacon = Beacon(),

        @JsonIgnore
        @ManyToOne
        val restaurant: Restaurant = Restaurant()

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RestaurantTable

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id ?: 0
    }

    override fun toString(): String {
        return "RestaurantTable(id=$id)"
    }
}