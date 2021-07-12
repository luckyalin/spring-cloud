package com.cloud.consumer9001.fallback;

import com.cloud.common.entity.CommonResult;
import com.cloud.common.enums.ExceptionEnum;
import com.cloud.consumer9001.clients.UserClient;
import org.springframework.stereotype.Component;

@Component
public class UserFallBack implements UserClient {

    @Override
    public CommonResult<Object> get() {
        return new CommonResult<>(ExceptionEnum.BUSY);
    }
}
