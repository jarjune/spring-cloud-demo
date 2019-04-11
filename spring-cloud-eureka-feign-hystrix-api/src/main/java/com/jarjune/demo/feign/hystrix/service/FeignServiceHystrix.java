package com.jarjune.demo.feign.hystrix.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String demo(String arg) {
        return "error: " + arg;
    }
}
