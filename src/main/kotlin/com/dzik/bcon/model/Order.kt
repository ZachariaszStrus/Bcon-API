package com.dzik.bcon.model

import javax.persistence.*

@Entity
@Table(name = "`order`")
data class Order (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = 0,

        @Column(name = "restaurantId")
        val restaurant_id: Int = 0,

        @Column(name = "`table`")
        val table: Int = 0,

        @Enumerated(EnumType.STRING)
        val status: OrderStatus = OrderStatus.PENDING
)

