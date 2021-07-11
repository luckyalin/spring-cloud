package com.cloud.provider8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * provider8001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8002Application.class, args);
    }
}
