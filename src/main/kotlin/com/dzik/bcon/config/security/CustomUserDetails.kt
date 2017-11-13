package com.dzik.bcon.config.security

import com.dzik.bcon.model.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class CustomUserDetails(
        val user: User
) : UserDetails{
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return user.roles
                .map { role ->
                    var name = role.name.name.toUpperCase()
                    if(!name.startsWith("ROLE_"))
                        name = "ROLE_" + name
                    SimpleGrantedAuthority(name)
                }
                .toMutableList()
    }

    override fun getUsername(): String = user.username

    override fun getPassword(): String = user.password

    override fun isAccountNonExpired(): Boolean = true // temporary

    override fun isAccountNonLocked(): Boolean = true // temporary

    override fun isEnabled(): Boolean = true // temporary

    override fun isCredentialsNonExpired(): Boolean = true // temporary

}