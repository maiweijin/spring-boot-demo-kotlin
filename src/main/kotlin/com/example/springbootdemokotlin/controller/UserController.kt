package com.example.springbootdemokotlin.controller

import com.example.springbootdemokotlin.model.User
import com.example.springbootdemokotlin.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {
    @Autowired
    lateinit var userRepository:UserRepository;
    @GetMapping("user/{id}")
    fun getUser(@PathVariable("id")id:Long):User{
        var result = userRepository.findById(id).get();
        println(result.javaClass)
        println(result.job?.javaClass)
        return result;
    }

    @PostMapping("user")
    fun addUser(@RequestBody user:User):Long?{
        println(user);
        userRepository.save(user);
        return user.id;
    }
}