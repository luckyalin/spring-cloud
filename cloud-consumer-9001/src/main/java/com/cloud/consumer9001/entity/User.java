package com.cloud.consumer9001.entity;
import lombok.Data;

import java.io.Serializable;

/**
 * User
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
}
