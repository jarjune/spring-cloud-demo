package com.jarjune.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaFeignConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaFeignConsumerApplication.class);
    }
}
