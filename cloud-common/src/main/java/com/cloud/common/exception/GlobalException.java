package com.cloud.common.exception;

import com.cloud.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * GlobalException
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@Data
@AllArgsConstructor
public class GlobalException extends Exception{
    private ExceptionEnum exceptionEnum;
}
