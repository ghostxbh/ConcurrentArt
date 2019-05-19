package com.uzykj.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.uzykj.mall.dao")
public class UzykjMallApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UzykjMallApiApplication.class, args);
    }

}
