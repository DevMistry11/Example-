package com.Security.Example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Hello world using restController";
    }

    @GetMapping("/home/1")
    public String home1(){
        return "Hello world using restController";
    }
    @GetMapping("/home/12")
    public String home12(){
        return "Hello world using restController";
    }

    @GetMapping("/home/1/2")
    public String home2(){
        return "Hello world using restController";
    }


    @GetMapping("/user")
    public String user(){
        return "user using restController";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin using restController";
    }

}
