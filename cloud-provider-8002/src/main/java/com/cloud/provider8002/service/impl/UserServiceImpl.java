package com.cloud.provider8002.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.provider8002.entity.User;
import com.cloud.provider8002.mapper.UserMapper;
import com.cloud.provider8002.service.UserService;
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
