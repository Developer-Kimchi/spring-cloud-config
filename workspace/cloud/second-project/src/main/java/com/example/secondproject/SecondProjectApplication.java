package com.example.secondproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondProjectApplication.class, args);
    }

}
