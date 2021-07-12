package com.cloud.consumer9001.clients;

import com.cloud.common.entity.CommonResult;
import com.cloud.consumer9001.fallback.UserFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = UserFallBack.class)
public interface UserClient {
    @GetMapping("user")
    CommonResult<Object> get();
}
