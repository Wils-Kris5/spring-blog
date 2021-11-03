package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class PartialsController {
    @GetMapping("/partials")
    public String showPartials(){
        return "views-lec/partials-test";
    }
}
