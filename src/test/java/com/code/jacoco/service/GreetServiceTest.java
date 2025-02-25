package com.code.jacoco.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GreetServiceTest {

    @InjectMocks
    private GreetService greetService;

    @Test
    void testGreet() {
//        assertEquals("Hello, World!", greetService.greet(null));
        assertEquals("Hello, Alice!", greetService.greet("Alice"));
    }
}
