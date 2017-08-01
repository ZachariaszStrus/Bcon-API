package com.dzik.bcon

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BconApplication

fun main(args: Array<String>) {
    SpringApplication.run(BconApplication::class.java, *args)
}
