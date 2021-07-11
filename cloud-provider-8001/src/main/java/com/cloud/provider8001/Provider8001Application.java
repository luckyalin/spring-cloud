package com.cloud.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * provider8001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class, args);
    }
}
