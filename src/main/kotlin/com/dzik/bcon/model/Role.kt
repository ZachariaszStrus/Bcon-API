package com.dzik.bcon.model

import com.dzik.bcon.model.utils.UserRoleType
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "role")
data class Role (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,

        @Enumerated(EnumType.STRING)
        @Column(name = "role_name")
        val name: UserRoleType = UserRoleType.USER
) : Serializable