package com.cloud.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ExceptionEnum
 *
 * @author 李钰林
 * @date 2021/7/2
 */
@AllArgsConstructor
public enum ExceptionEnum {
    NOT_FOUND("404","资源不存在"),
    BUSY("601","服务器繁忙");
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
