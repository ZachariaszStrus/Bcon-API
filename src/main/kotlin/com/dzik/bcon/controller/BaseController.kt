package com.dzik.bcon.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

open class BaseController {

    fun <T> ok(body: T): ResponseEntity<T> {
        return ResponseEntity.ok(body)
    }

    fun <T> notFound(body: T? = null): ResponseEntity<T?> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body)
    }
}