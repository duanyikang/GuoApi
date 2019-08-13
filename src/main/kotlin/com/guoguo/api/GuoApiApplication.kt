package com.guoguo.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class SpringKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinApplication::class.java, *args)
}
