package com.example.demo_fresh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCtroller {

    @RequestMapping("/testBoot")
    public String test() {
        return "hell world! 这是我的第一个SpringBoot项目!";
    }
}
