package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class EConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EConfigClientApplication.class,args);
    }
}
