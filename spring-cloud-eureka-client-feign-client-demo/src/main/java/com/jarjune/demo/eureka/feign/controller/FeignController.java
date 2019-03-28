package com.jarjune.demo.eureka.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @RequestMapping("demo")
    public String getDemo(String arg) {
        return "feign: client: " + arg;
    }
}
