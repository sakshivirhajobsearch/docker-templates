package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring Boot in Docker!");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
