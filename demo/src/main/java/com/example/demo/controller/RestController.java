package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api"
)
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/test")
    public String test(String name) {
        int count = 0;
        System.err.println(count++);
        name="Test";
        return "Hello";
    }
}
