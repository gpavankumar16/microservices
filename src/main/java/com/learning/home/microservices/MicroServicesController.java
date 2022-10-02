package com.learning.home.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServicesController {

    @RequestMapping("/helloService")
    public String hello(){

        return "This is a sample test Spring Boot service";
    }
    
}
