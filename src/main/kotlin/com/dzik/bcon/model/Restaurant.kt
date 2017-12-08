package com.dzik.bcon.model

import com.dzik.bcon.model.utils.PaymentOption
import javax.persistence.*


@Entity
data class Restaurant (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        var name: String = "",

        @OneToMany(cascade = [(CascadeType.ALL)])
        @JoinColumn(name="restaurant_id")
        var menuItems: Set<MenuItem> = HashSet(),

        @OneToMany(mappedBy = "restaurant", cascade = [(CascadeType.ALL)])
        val tables: MutableList<RestaurantTable> = mutableListOf(),

        val imageUrl: String = "http://lorempixel.com/400/400/",

        @ElementCollection
        @Enumerated(EnumType.STRING)
        val paymentOptions: MutableList<PaymentOption> = mutableListOf(PaymentOption.CASH, PaymentOption.CARD)
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

