package com.cloud.provider8002.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * User
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Data
@TableName("t_user")
public class User implements Serializable {
    @TableId
    private Long id;
    private String name;
}
