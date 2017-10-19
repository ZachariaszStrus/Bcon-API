package com.dzik.bcon

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.userdetails.UserDetailsService
import javax.sql.DataSource


@SpringBootApplication
class BconApplication(
        val dataSource: DataSource
) {

    @Autowired
    fun authenticationManager(builder: AuthenticationManagerBuilder,
                              userRepository: UserRepository) {
        builder.userDetailsService(
                        UserDetailsService { username ->
                            CustomUserDetails(userRepository.findByUsername(username))
                        })
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(BconApplication::class.java, *args)
}
