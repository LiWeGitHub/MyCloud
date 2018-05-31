package com.lw.myfegion.service;

import org.springframework.stereotype.Component;

@Component
public class RegionServiceHystric implements  RegionService {
    @Override
    public String getInfoClientOne(String name) {
        return "error"+name;
    }
}
