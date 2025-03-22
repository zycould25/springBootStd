package com.example.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NeoController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
