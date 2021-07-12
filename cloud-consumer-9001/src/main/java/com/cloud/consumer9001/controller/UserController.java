package com.cloud.consumer9001.controller;

import com.cloud.common.entity.CommonResult;
import com.cloud.consumer9001.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserClient userClient;

    @GetMapping
    public CommonResult<Object> get(){
        return userClient.get();
    }
}
