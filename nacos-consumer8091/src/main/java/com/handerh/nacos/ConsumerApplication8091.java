package com.handerh.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication8091 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication8091.class,args);
    }
}
