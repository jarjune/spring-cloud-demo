package com.jarjune.demo.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EurekaConsumerController {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate template;

    @RequestMapping("demo")
    public String demo(String arg) {
        ServiceInstance instance = client.choose("eureka-client");
        Map<String, Object> params = new HashMap<>();
        params.put("arg", "params-" + arg);
        return template.getForObject(instance.getUri() + "/demo?arg={arg}", String.class, params);
    }
}
