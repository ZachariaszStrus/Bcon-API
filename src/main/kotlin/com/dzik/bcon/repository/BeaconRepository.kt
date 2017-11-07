package com.dzik.bcon.repository

import com.dzik.bcon.model.Beacon
import org.springframework.data.jpa.repository.JpaRepository


interface BeaconRepository : JpaRepository<Beacon, Int> {
    fun findByNamespaceAndInstance(
            namespace: String,
            instance: String
    ) : Beacon?
}