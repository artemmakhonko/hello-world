package com.company;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    int count = 0;

    @RequestMapping("/")
    public String index() {
        count++;
        return "<h2>Greetings from Spring Boot! Count = " + count + "</h2>";
    }

}
