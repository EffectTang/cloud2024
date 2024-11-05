package com.atguigu.cloud.controller;

import com.atguigu.cloud.api.PayFeignApi;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author starlord
 * @description
 * @create 2024/11/5
 */
@RestController
public class OrderNacosController {

    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping("/nacos/api/info/{id}")
    public String getTestInfo(@PathVariable("id")Integer id){
        String payInfo = payFeignApi.getPayInfo(id);
        return "this is consumer = api +"+payInfo;
    }
}
