package com.lw.myfegion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "myClient",fallback = RegionServiceHystric.class)
public interface RegionService {
    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    String getInfoClientOne(@RequestParam(value = "name") String name);
}
