package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("进入controller");
        return "hello world!";
    }

    @GetMapping("/index")
    public String index(){
        System.out.println("进入首页");
        return "欢迎进入首页！";
    }
}
