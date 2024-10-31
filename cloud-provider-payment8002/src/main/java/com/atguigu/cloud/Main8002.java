package com.atguigu.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@Slf4j
@MapperScan("com.atguigu.cloud.mapper")
public class Main8002 {
    public static void main(String[] args) {

        Environment environment = SpringApplication.run(Main8002.class, args).getEnvironment();

        log.info("地址:\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
        log.info("swagger:\thttp://127.0.0.1:{}/swagger-ui.html",environment.getProperty("server.port"));
    }
}