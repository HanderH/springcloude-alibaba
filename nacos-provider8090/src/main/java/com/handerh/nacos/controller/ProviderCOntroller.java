package com.handerh.nacos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderCOntroller {

    @RequestMapping("/nacos/{name}")
    public String getMapping(@PathVariable String name){
        return  "Hello Nacos Discovery " + name;
    }
}
