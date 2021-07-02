package com.cloud.provider8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.provider8001.entity.User;
import com.cloud.provider8001.mapper.UserMapper;
import com.cloud.provider8001.service.UserService;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
