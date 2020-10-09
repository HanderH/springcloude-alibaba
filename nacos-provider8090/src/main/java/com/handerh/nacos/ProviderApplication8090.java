package com.handerh.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication8090 {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProviderApplication8090.class,args);

        String name = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");

        System.out.println(name+": "+age);
        System.out.println("===============init====================");
    }
}
