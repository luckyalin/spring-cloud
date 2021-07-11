package com.cloud.provider8002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.provider8002.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
