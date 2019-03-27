package com.jarjune.demo.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @RequestMapping("demo")
    public String demo(String arg) {
        return " client: " + arg;
    }
}
