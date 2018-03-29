package com.example.springbootdemokotlin.repository

import com.example.springbootdemokotlin.model.Job
import com.example.springbootdemokotlin.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User,Long>{
}

interface JobRepository : CrudRepository<Job,Long>{
}