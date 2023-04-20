package com.tesco.web.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WebTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebTestApplication.class, args);
    }
}
