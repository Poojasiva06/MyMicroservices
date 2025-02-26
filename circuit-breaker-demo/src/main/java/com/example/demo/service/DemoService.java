package com.example.demo.service;

import org.springframework.stereotype.Service;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class DemoService {

    private static final String CIRCUIT_BREAKER_NAME = "demoService";

    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackResponse")
    public String riskyOperation() {
        throw new RuntimeException("Simulated failure!");
    }

    public String fallbackResponse(Exception e) {
        return "Fallback response: Service is unavailable";
    }
}
