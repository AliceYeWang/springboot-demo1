package com.example.wy.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/test")
    String test2() {
        return "Hello World!";
    }
}