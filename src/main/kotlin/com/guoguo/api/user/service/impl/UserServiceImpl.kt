package com.guoguo.api.user.service.impl

import com.guoguo.api.user.User
import com.guoguo.api.user.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service


@Service
class UserServiceImpl : IUserService {

    @Autowired
    lateinit var redisTemplate: RedisTemplate<Any, Any>

    override fun getUser(username: String): User {

        var user = redisTemplate.opsForValue().get("user_${username}")

        if (user == null) {

            user = User("default","000000")
         }

        return user as User
    }

    override fun createUser(username: String, password: String) {

        redisTemplate.opsForValue().set("user_${username}", User(username, password))
    }

}
