package com.cloud.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * provider8001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableEurekaClient
public class provider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(provider8001Application.class, args);
    }
}
