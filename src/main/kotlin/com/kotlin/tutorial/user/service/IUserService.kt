package com.kotlin.tutorial.user.service

import com.kotlin.tutorial.user.User

interface IUserService {

    fun getUser(username: String): User

    fun createUser(username: String,password: String)
}