package com.dzik.bcon.model

import com.dzik.bcon.model.utils.OrderStatus
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

        @OneToMany(mappedBy = "order", cascade = arrayOf(CascadeType.ALL))
        val orderItems: Set<OrderItem> = HashSet()
)

