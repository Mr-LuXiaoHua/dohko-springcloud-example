package com.dohko.example.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DohkoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DohkoEurekaServerApplication.class, args);
    }

}
