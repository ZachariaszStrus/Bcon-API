package com.dzik.bcon.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "menu")
data class Menu (

        @Id
        @GeneratedValue
        var id: Int
)
