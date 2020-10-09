package com.handerh.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigApplication.class,args);

//        while(true){
            String name = applicationContext.getEnvironment().getProperty("user.name");
            String age = applicationContext.getEnvironment().getProperty("user.age");
             String env = applicationContext.getEnvironment().getProperty("env");
            System.out.println(name + " : " + age + ": "+env);
            System.out.println("==========init===========");
//            TimeUnit.SECONDS.sleep(1);
//        }


    }
}
