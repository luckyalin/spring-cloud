package com.cloud.configClient.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class Config {
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String port;
}
