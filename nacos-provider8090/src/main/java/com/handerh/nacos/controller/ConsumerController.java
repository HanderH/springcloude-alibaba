/*
package com.handerh.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/consumer/nacos-provider-8090")
    public String getMapping(){

        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider-8090");
        String path = String.format("http://%s:%s/provider/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("请求的URI为: "+path);
        return  restTemplate.getForObject(path,String.class);
    }
}
*/
