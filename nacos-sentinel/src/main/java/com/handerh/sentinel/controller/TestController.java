package com.handerh.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hello")
    @SentinelResource(value = "hello",blockHandler = "exceptionHandler", fallback = "helloFallback")
    public String hello() {
        int i = 10/0;
        return "Hello Sentinel";
    }
    public String  exceptionHandler(BlockException blockException){
        String ruleLimitApp = blockException.getRuleLimitApp();
        System.out.println(ruleLimitApp);
        return ruleLimitApp;
    }

    public String helloFallback(){
        return "Hello  Sentinel helloFallback";
    }
}
