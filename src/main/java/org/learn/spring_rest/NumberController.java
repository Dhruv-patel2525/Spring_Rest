package org.learn.spring_rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    @GetMapping("/double")
    public int multiplyByTwo(@RequestParam("number") int number)
    {
        return number*2;
    }
}
