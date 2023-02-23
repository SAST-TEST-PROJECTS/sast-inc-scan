package io.mend.analysis.repo.test.controller;

import io.mend.analysis.repo.test.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sast")
public class Controller1 {

    @Autowired
    private Service1 service1;

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }


    @GetMapping("/logUserInput")
    public void logUserInput(String userInput){
        service1.logUserInput(userInput);
    }


}
