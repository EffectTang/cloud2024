package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author starlord
 * @description
 * @create 2024/11/5
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MainApi {

    public static void main(String[] args) {
        SpringApplication.run(MainApi.class,args);
    }
}
