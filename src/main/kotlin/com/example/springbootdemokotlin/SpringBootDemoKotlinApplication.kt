package com.example.springbootdemokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableJpaRepositories("com.example.springbootdemokotlin.repository")
@EnableSwagger2
class SpringBootDemoKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootDemoKotlinApplication>(*args)
}
