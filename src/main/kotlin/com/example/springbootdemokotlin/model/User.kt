package com.example.springbootdemokotlin.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.LazyToOne
import org.hibernate.annotations.LazyToOneOption
import javax.persistence.*

@Entity
data class User(@JsonProperty(access=JsonProperty.Access.READ_ONLY) @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Long?=null,
                @Column(name="user_name")var name:String?=null,
                @Column(name="user_age")var age:Int?=null,
                @ManyToOne(cascade=arrayOf(CascadeType.PERSIST),fetch = FetchType.LAZY) @JoinColumn(name="user_job")  var job:Job?=null);

@Entity
data class Job(@JsonProperty(access=JsonProperty.Access.READ_ONLY) @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Long?=null,
               @Column(name="job_name")var name:String?=null);