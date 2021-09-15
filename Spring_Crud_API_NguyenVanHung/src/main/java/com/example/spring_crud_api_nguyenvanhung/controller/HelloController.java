package com.example.spring_crud_api_nguyenvanhung.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld(){
        return "Van Hung Hello!";
    }
}
