package com.wang.springboot.faceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FaceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceApiApplication.class, args);
    }
}
