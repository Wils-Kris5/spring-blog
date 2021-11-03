package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.*;

public class MathController {
    //****AT THE TIME OF WRITING THESE METHODS, THESE WERE WRITTEN FOR INTS, IM NOT SURE IF THAT WILL CHANGE****
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public double divide(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0!");
        }
        return (double) num1 / (double) num2;
    }
}
