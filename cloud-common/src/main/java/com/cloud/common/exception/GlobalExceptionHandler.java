package com.cloud.common.exception;


import com.cloud.common.entity.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ExceptionHandler
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GlobalException.class)
    public CommonResult globalExceptionHandler(GlobalException e){
        return new CommonResult(e.getExceptionEnum());
    }
}
