package com.cloud.common.entity;

import com.cloud.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CommonResult
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public static CommonResult success(Object obj){
        return new CommonResult("200","操作成功",obj);
    }

    public CommonResult(ExceptionEnum e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }
}
