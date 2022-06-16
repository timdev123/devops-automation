package com.dockerexample.DockerExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String hello(){
        return "<h1> This is my first docker microservice </h1>";
    }
}
