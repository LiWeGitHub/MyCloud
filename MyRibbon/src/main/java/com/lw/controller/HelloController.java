package com.lw.controller;

import com.lw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/getInfo")
    public String getInfo(@RequestParam(value = "name", required = false) String name) {
        return helloService.hiService(name);
    }
}
