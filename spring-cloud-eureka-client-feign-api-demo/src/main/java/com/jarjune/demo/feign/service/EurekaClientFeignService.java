package com.jarjune.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("feign-client")
public interface EurekaClientFeignService {

    @RequestMapping(value = "demo")
    String getDemo(@RequestParam("arg") String arg);
}
