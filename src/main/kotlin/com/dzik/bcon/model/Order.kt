package com.dzik.bcon.model

import com.dzik.bcon.model.utils.OrderStatus
import javax.persistence.*

@Entity
@Table(name = "customer_order")
data class Order (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = 0,

        @Enumerated(EnumType.STRING)
        val status: OrderStatus = OrderStatus.PENDING,

        @OneToMany(cascade = [(CascadeType.ALL)])
        @JoinColumn(name = "order_id")
        var orderItems: Set<OrderItem> = HashSet(),

        @ManyToOne
        @JoinColumn(name = "table_id")
        val table: RestaurantTable = RestaurantTable(),

        val fcmToken: String = ""
)

