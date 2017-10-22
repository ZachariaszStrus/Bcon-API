package com.dzik.bcon

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder


@SpringBootApplication
class BconApplication {

    @Autowired
    fun authenticationManager(builder: AuthenticationManagerBuilder,
                              userRepository: UserRepository) {
        builder
                .userDetailsService(UserDetailsService { username ->
                    CustomUserDetails(userRepository.findByUsername(username))
                })
                .passwordEncoder(passwordEncoder())
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()
}

fun main(args: Array<String>) {
    SpringApplication.run(BconApplication::class.java, *args)
}
