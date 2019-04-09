package com.jarjune.demo.config.client.controller;

import com.jarjune.demo.config.client.dao.TestLinkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${flag}")
    private String flag;

    @Autowired
    private TestLinkDao dao;

    @RequestMapping("flag")
    public String test() {
        System.out.println(dao.testSelect());
        return flag;
    }
}
