package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Hello {
    @GetMapping("/helloword")
    @ResponseBody
    public String helloword(){
        return "hello word";
    }

}

