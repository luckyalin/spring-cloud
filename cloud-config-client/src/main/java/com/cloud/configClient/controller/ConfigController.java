package com.cloud.configClient.controller;

import com.cloud.common.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping
    private CommonResult<Object> getConfig(){
        return CommonResult.success(configInfo);
    }
}
