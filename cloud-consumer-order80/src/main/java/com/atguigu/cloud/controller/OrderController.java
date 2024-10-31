package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author starlord
 * @description
 * @create 2024/10/31
 */
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    public static final String PaymentSrv_URL = "http://localhost:8002";

    @GetMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO){
        return restTemplate.postForObject(PaymentSrv_URL + "/pay/add",payDTO,ResultData.class);
    }
    // 删除+修改操作作为家庭作业，O(∩_∩)O。。。。。。。
    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/"+id, ResultData.class, id);
    }

    @DeleteMapping("/consumer/pay/delete/{id}")
    public ResultData deleteById(@PathVariable("id")Integer id){
         restTemplate.delete(PaymentSrv_URL+"/pay/delete/"+id,id);
         return ResultData.success(1);
    }
}
