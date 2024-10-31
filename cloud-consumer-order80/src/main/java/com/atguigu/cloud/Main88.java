package com.atguigu.cloud;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class Main88 {

    public static void main(String[] args) {
        Environment environment = SpringApplication.run(Main88.class, args).getEnvironment();

        log.info("地址:\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
        log.info("swagger:\thttp://127.0.0.1:{}/swagger-ui.html",environment.getProperty("server.port"));
    }
}