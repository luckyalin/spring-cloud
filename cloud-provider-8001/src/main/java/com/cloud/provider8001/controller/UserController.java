package com.cloud.provider8001.controller;

import com.cloud.common.entity.CommonResult;
import com.cloud.common.enums.ExceptionEnum;
import com.cloud.provider8001.entity.User;
import com.cloud.provider8001.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Value("server.port")
    private String port;

    @GetMapping
    @HystrixCommand(fallbackMethod = "getUserFallBack")
    public CommonResult<Object> get(){
        log.info("port"+port);
        return CommonResult.success(userService.list());
    }

    public CommonResult<Object> getUserFallBack(){
        return new CommonResult<>(ExceptionEnum.BUSY);
    }
}
