package com.dzik.bcon

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.jdbc.core.JdbcTemplate



@SpringBootApplication
class BconApplication(val jdbcTemplate: JdbcTemplate) : CommandLineRunner{

    override fun run(vararg p0: String?) {
        System.out.println(jdbcTemplate)
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(BconApplication::class.java, *args)
}
