package com.dzik.bcon.config.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore
import javax.sql.DataSource
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices





@Configuration
@EnableAuthorizationServer
class AuthorizationServerConfig(
        val authenticationManager: AuthenticationManager,
        val dataSource: DataSource
) : AuthorizationServerConfigurerAdapter() {

    val passwordEncoder = BCryptPasswordEncoder()

    override fun configure(security: AuthorizationServerSecurityConfigurer) {
        security.passwordEncoder(passwordEncoder)
    }

    override fun configure(clients: ClientDetailsServiceConfigurer) {
        clients.jdbc(dataSource)
    }

    override fun configure(endpoints: AuthorizationServerEndpointsConfigurer) {
        endpoints.authorizationCodeServices(authorizationCodeServices())
                .authenticationManager(authenticationManager)
                .tokenStore(tokenStore())
                .approvalStoreDisabled()

    }

    @Bean
    fun tokenStore(): JdbcTokenStore = JdbcTokenStore(dataSource)

    @Bean
    fun authorizationCodeServices(): AuthorizationCodeServices
            = JdbcAuthorizationCodeServices(dataSource)

}