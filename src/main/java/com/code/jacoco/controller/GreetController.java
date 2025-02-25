package com.code.jacoco.controller;

import com.code.jacoco.service.GreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private final GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", required = false) String name) {
        return greetService.greet(name);
    }
}
