package com.garden.ms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTest {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
