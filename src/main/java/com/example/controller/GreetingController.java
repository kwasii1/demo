package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/fuckspring")
    public String sayFuckSpring(){
        return "Fuck spring!!!!!!";
    }
}
