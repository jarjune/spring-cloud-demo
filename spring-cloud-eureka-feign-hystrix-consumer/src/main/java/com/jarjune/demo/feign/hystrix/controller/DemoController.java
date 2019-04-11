package com.jarjune.demo.feign.hystrix.controller;

import com.jarjune.demo.feign.hystrix.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("demo")
    public String demo() {
        return feignService.demo("123");
    }
}
