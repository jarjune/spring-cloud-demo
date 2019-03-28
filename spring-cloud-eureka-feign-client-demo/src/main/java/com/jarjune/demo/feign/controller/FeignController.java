package com.jarjune.demo.feign.controller;

import com.jarjune.demo.feign.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController implements FeignService {

    @Override
    public String getDemo(String arg) {
        return "feign: client: " + arg;
    }
}
