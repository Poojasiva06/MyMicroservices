package com.example.demo.controller;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/to-read")
public class DemoController {

    private static final String CIRCUIT_BREAKER_NAME = "bookstoreService";

    @GetMapping
    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackBooks")
    public List<String> toRead() {
        throw new RuntimeException("Simulated service failure!");
    }


    public List<String> fallbackBooks(Exception e) {
        return Collections.singletonList("Fallback: No books available at the moment.");
    }
}
