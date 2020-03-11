package com.freudromero.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "hello-world";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
