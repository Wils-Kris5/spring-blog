
  package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class AdController {

        @GetMapping("/mads")
        @ResponseBody
        public String showAds() {
            return "Showing all the ads";
        }

        @GetMapping("/mads/{id}")
        @ResponseBody
        public String showSingleDad(@PathVariable long id) {
            return "Showing dad: " + id;
        }

        @PostMapping ("/mads")
        @ResponseBody
        public String createAds() {
            return "Creating ads";
        }
    }
