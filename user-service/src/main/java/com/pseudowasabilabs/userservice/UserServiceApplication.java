package com.pseudowasabilabs.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
// EnableEurekaClient <-> EnableDiscoveryClient
// - EnableEurekaClient for Eureka
// - EnableDiscoveryClient for general usage
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
