package com.example.microserviceclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Base URL for endpoints
public class HelloController {

    @GetMapping("/hello") // Maps to /api/hello
    public String sayHello() {
        return "Hello from Microservice Client!";
    }
}
