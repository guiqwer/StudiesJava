package com.guilherme.first_spring_app.controller;


import com.guilherme.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//fazendo o end point
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    //no lugar de passar o construtor pra pegar o HelloWorldService vou usar o
    // @autowired que ja faz a injeção da dependencia
    /*
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }*/

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Guilherme");
    }
}
