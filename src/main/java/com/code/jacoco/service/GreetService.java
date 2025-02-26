package com.code.jacoco.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String greet(String name) {
        if (name != null) {
            return "Hello " + name + "!";
        } else {
            return "You are missing!";
        }
    }
}
