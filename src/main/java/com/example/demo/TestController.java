package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${uuid}")
    private String uuid;

    @GetMapping(value = "/test")
    public String showMessage() {
        return "Test " + uuid;
    }
}
