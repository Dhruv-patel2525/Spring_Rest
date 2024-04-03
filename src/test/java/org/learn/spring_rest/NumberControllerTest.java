package org.learn.spring_rest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@WebMvcTest(NumberController.class)
class NumberControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void numberControllerTestUsingMock() throws Exception {
        //when(service.greet()).thenReturn("Hello, Mock");
        this.mockMvc.perform(get("/double")
                        .param("number","5"))
                        .andExpect(status().isOk())
                        .andExpect(content().string(containsString("10")));
    }



}

