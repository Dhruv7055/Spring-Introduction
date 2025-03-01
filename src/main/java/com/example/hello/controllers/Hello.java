package com.example.hello.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {



    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Dhruv this is my first spring boot application! ! !";

    }
    // UC2
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name+"Thanks for using my application";
    }
    // UC3 - PathParams
    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello " + name+"Thanks for using my application";
    }

}