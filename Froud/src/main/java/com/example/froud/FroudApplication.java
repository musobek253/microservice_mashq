package com.example.froud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FroudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FroudApplication.class, args);
    }

}
