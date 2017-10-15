package com.dzik.bcon.model

import javax.persistence.*

@Entity
@Table(name = "customer_order")
data class Order (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = 0,

        @Column(name = "restaurant_id")
        val restaurantId: Int = 0,

        @Column(name = "table_number")
        val table: Int = 0,

        @Enumerated(EnumType.STRING)
        val status: OrderStatus = OrderStatus.PENDING,

        @OneToMany
        @JoinColumn(name="customer_order_id")
        val orderItems: Set<OrderItem> = HashSet()
)

