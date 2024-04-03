package org.learn.spring_rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    void numberControllerTestUsingRestTemplate() throws Exception
    {
        String fooResourceUrl
                = "http://localhost:"+port+"/double";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl + "?number=5", String.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
}
