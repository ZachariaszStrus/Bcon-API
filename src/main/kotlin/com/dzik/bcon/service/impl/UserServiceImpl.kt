package com.dzik.bcon.service.impl

import com.dzik.bcon.controller.user.UserPost
import com.dzik.bcon.model.Role
import com.dzik.bcon.model.User
import com.dzik.bcon.model.utils.UserRoleType
import com.dzik.bcon.repository.UserRepository
import com.dzik.bcon.service.UserService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class UserServiceImpl (
        val passwordEncoder: PasswordEncoder,
        val userRepository: UserRepository
) : UserService {
    override fun create(userPost: UserPost, userRoles: List<UserRoleType>): User? {
        val hashedPasswod = passwordEncoder.encode(userPost.password)

        val user = User(
                username = userPost.username,
                password = hashedPasswod,
                roles = userRoles.map { roleType -> Role(name = roleType) }
        )

        return this.userRepository.save(user)
    }
}