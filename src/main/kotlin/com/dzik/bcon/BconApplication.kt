package com.dzik.bcon

import com.dzik.bcon.config.security.CustomUserDetails
import com.dzik.bcon.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.crypto.password.PasswordEncoder


@SpringBootApplication
class BconApplication {

    @Autowired
    fun authenticationManager(builder: AuthenticationManagerBuilder,
                              passwordEncoder: PasswordEncoder,
                              userRepository: UserRepository) {
        val authProvider = DaoAuthenticationProvider()
        authProvider.setPasswordEncoder(passwordEncoder)
        authProvider.setUserDetailsService { username ->
            CustomUserDetails(userRepository.findByUsername(username))
        }
        builder.authenticationProvider(authProvider)

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(BconApplication::class.java, *args)
}
