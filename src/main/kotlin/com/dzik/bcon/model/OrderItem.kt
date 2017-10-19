package com.dzik.bcon.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*


@Entity
@Table(name = "order_item")
data class OrderItem (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = 0,

        @Column(name = "menu_item_id")
        val menuItemId: Int = 0,

        @JsonIgnore
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "menu_item_id", insertable = false, updatable = false)
        val menuItem: MenuItem? = null
)