package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;

@Cacheable
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
