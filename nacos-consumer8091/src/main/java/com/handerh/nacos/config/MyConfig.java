package com.handerh.nacos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Bean
    public RestTemplate getTestTemplate(){
        return new RestTemplate();
    }
}
