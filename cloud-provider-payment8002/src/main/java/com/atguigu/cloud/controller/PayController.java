package com.atguigu.cloud.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONParser;
import com.alibaba.fastjson2.JSON;
import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author starlord
 * @description
 * @create 2024/10/30
 */

@RestController
@Slf4j
public class PayController {

    @Resource
    private PayService payService;

    @PostMapping("/pay/add")
    public String addPay(@RequestBody Pay pay){
        System.out.println(pay.toString());
        int i = payService.add(pay);
        return "success num is " + i;
    }

    @DeleteMapping("/pay/delete/{id}")
    public Integer deletePay(@PathVariable("id")Integer id ){
        return payService.delete(id);
    }

    @GetMapping("/pay/get/{id}")
    public Pay getById(@PathVariable("id")Integer id){
        Pay pay = payService.getById(id);
        System.out.println(pay.toString());
        return pay;
    }

    @PutMapping("/pay/update")
    public String update(@RequestBody PayDTO payDTO){
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO,pay);
        int i = payService.update(pay);
        return "the effective number of result is " + i;
    }

    @GetMapping("/pay/get/all")
    public String getAll(){
        List<Pay> pays = payService.getAll();
        return JSON.toJSONString(pays);
    }

}
