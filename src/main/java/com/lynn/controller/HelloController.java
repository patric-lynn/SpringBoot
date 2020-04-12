package com.lynn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("print")
    public String hello(){
        return "Hello man. This is really hard to get here.";
    }

    @RequestMapping("/happy")
    public int happy(){return 123;}


}
