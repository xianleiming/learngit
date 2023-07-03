package com.xlm.springboot_test_0621.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloCtroller {

    @RequestMapping("/mystatic/to")
    public String toIndex(Model model){
        model.addAttribute("msg","我是一个成熟的工具，能看见吗？");
        return "index";
    }
}
