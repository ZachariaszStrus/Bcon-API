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


@Configuration
@EnableAuthorizationServer
class AuthorizationServerConfig(
        val authenticationManager: AuthenticationManager,
        val dataSource: DataSource
) : AuthorizationServerConfigurerAdapter() {

    override fun configure(security: AuthorizationServerSecurityConfigurer) {
        security
                .checkTokenAccess("isAuthenticated()")
    }

    override fun configure(clients: ClientDetailsServiceConfigurer) {
        clients
                .inMemory()
                .withClient("bcon-web-app")
                .secret("secret")
                .authorities("ROLE_CLIENT","ROLE_TRUSTED_CLIENT")
                .resourceIds("oauth2-resource")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(60*60)
                .refreshTokenValiditySeconds(60*60*24*5)
                .and()
                .withClient("bcon-mobile-app")
                .secret("secret")
                .authorities("ROLE_CLIENT","ROLE_TRUSTED_CLIENT")
                .resourceIds("oauth2-resource")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(60*60)
                .refreshTokenValiditySeconds(60*60*24*30)
    }

    override fun configure(endpoints: AuthorizationServerEndpointsConfigurer) {
        endpoints
                .authenticationManager(authenticationManager)
                .tokenStore(tokenStore())
    }

    @Bean
    fun tokenStore(): JdbcTokenStore = JdbcTokenStore(dataSource)

}