package com.cloud.consumer9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Consumer9001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9002Application.class,args);
    }
}
