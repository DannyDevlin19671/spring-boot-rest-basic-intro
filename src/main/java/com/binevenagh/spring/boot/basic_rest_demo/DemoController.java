package com.binevenagh.spring.boot.basic_rest_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author danieldevlin
 * @date 08/04/2025
 * @project basic-rest-demo
 */

@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo() {
        return "Hello, from the simple REST demo!";
    }

    @PostMapping("/demo")
    public String demoPost() {
        return "Hello, from the simple REST demo POST!";
    }
}
