package com.example.hello.controllers;
import com.example.hello.model.User;

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

    // UC4 - PostMethod: Handles POST requests at "/post" with a User object in the request body.
    // URL: Use POST request at http://localhost:8080/post with JSON body: { "firstName": "Dhruv", "lastName": "Agarwal" }
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " Thanks for using my application";
    }

}