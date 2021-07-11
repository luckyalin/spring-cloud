package com.cloud.eureka6002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka6001Application
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka6002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka6002Application.class,args);
    }
}
