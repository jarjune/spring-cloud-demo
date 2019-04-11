package com.jarjune.demo.feign.controller;

import com.jarjune.demo.feign.service.EurekaClientFeignService;
import com.jarjune.demo.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    private EurekaClientFeignService eurekaClientFeignService;

    @RequestMapping("demo")
    public String demo(@RequestParam("arg") String arg) {

        return "feignConsimer: " + eurekaClientFeignService.getDemo(arg);
    }
}
