package com.binevenagh.spring.boot.basic_rest_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class serves as a REST controller for handling demo-related requests.
 * It provides endpoints for both GET and POST methods.
 */
@RestController
public class DemoController {

    /**
     * Handles GET requests to the "/demo" endpoint.
     *
     * @return A greeting message for the GET request.
     */
    @GetMapping("/demo")
    public String demo() {
        return "Hello, from the simple REST demo!";
    }

    /**
     * Handles POST requests to the "/demo" endpoint.
     *
     * @return A greeting message for the POST request.
     */
    @PostMapping("/demo")
    public String demoPost() {
        return "Hello, from the simple REST demo POST!";
    }
}
