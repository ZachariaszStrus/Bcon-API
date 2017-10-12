package com.dzik.bcon.model

import javax.persistence.*


@Entity
@Table(name = "order_item")
data class OrderItem (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = 0,

        @Column(name = "customer_order_id")
        val orderId: Int = 0,

        @Column(name = "menu_item_id")
        val menuItemId: Int = 0
)