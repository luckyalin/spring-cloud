package com.cloud.configClient;

import com.cloud.configClient.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366Application.class,args);
    }
}
