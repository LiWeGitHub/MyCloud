package com.lw.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Value("${server.port}")
    private String port;
    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String serviceUrl;

    @RequestMapping("/getInfo")
    public String getInfo(@RequestParam(value = "name", required = false) String name) {
        return "getInfo " + name + ",i am from port:" + port + "serviceUrl" + serviceUrl;
    }
}
