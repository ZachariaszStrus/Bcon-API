package com.dzik.bcon.service

import com.dzik.bcon.controller.user.UserPost
import com.dzik.bcon.model.User
import com.dzik.bcon.model.utils.UserRoleType

interface UserService {
    fun create(userPost: UserPost, userRoles: List<UserRoleType>): User?
}