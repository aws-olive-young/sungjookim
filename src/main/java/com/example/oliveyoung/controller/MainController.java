package com.example.oliveyoung.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping()
    public String index() {
        return "Believe you can,then you will!";
    }
}
