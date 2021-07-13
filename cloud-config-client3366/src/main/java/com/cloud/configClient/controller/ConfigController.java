package com.cloud.configClient.controller;

import com.cloud.common.entity.CommonResult;
import com.cloud.configClient.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {
    @Autowired
    private Config config;

    @GetMapping
    private CommonResult<Object> getConfig(){
        return CommonResult.success(config.getPort() + "    " +config.getConfigInfo());
    }
}
