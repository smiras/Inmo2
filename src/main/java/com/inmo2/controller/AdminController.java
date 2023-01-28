package com.inmo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("http://localhost:5000")
public class AdminController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    
}
