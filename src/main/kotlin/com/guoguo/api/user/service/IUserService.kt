package com.guoguo.api.user.service

import com.guoguo.api.user.User

interface IUserService {

    fun getUser(username: String): User

    fun createUser(username: String,password: String)
}