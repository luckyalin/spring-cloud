package com.cloud.consumer9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Consumer9001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9001Application.class,args);
    }
}
