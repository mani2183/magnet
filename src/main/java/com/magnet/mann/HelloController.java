package com.magnet.mann;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Welcome to Hello Banking API!");
    }
    @GetMapping("/getpath/{name}")
    public HelloResponse withPath(@PathVariable String name){
        return new HelloResponse("hello  "+name);
    }


    @PostMapping("/postHello")
    public HelloResponse postHello(@RequestBody String name){
        return new HelloResponse("Hello, "+ name+"! Welcome to Hello Banking API.");
    }
}
