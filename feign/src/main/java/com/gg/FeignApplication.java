package com.gg;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignApplication.class, args);

    }
}
