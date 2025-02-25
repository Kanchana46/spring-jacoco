package com.code.jacoco.controller;

import com.code.jacoco.service.GreetService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GreetControllerTest {

    private MockMvc mockMvc;

    @Mock
    private GreetService greetService;

    @InjectMocks
    private GreetController greetController;

    @Test
    void testGreet() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(greetController).build();

        when(greetService.greet("Alice")).thenReturn("Hello, Alice!");

        mockMvc.perform(get("/greet").param("name", "Alice"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Alice!"));
    }
}
