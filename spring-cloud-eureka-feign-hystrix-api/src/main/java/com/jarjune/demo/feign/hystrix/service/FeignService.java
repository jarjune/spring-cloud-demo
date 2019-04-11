package com.jarjune.demo.feign.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "demo")
    String demo(@RequestParam("arg") String arg);
}
