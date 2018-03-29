package com.example.springbootdemokotlin.controller;

import com.example.springbootdemokotlin.model.Job;
import com.example.springbootdemokotlin.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    @Autowired
    JobRepository jobRepository;
    @GetMapping("job/{id}")
    public Job getJob(@PathVariable("id") Long id){
        return jobRepository.findById(id).orElseThrow(()->new RuntimeException());
    }
    @PostMapping("job")
    public Long addJob(@RequestBody Job job){
        jobRepository.save(job);
        return job.getId();
    }
}
