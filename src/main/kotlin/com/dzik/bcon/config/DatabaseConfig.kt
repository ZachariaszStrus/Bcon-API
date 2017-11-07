package com.dzik.bcon.config

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DatabaseConfig {

    val localUrl = "jdbc:postgresql://localhost:5432/venite"

    val localUsername = "zaki"

    val localPassword = "1234"

    @Bean
    fun dataSource(): DataSource {
        val springDbUrl = System.getenv("SPRING_DATASOURCE_URL")
        return if(springDbUrl != null) {
            DataSourceBuilder.create()
                    .url(springDbUrl)
                    .build()
        } else {
            DataSourceBuilder.create()
                    .url(localUrl)
                    .username(localUsername)
                    .password(localPassword)
                    .build()
        }
    }
}