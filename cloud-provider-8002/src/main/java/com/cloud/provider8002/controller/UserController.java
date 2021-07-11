package com.cloud.provider8002.controller;

import com.cloud.common.entity.CommonResult;
import com.cloud.provider8002.entity.User;
import com.cloud.provider8002.service.UserService;
import com.cloud.provider8002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public CommonResult<List<User>> get(){
        return CommonResult.success(userService.list());
    }
}
