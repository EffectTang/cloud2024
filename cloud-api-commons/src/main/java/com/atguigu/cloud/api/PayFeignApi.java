package com.atguigu.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author starlord
 * @description
 * @create 2024/11/5
 */
@FeignClient("nacos-producer")
public interface PayFeignApi {

    @GetMapping(value = "/pay/nacos/{id}")
    public String getPayInfo(@PathVariable("id") Integer id);

}
