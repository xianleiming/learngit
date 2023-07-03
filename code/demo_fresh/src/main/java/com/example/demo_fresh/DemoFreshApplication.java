package com.example.demo_fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo_fresh.dao")
public class DemoFreshApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFreshApplication.class, args);
    }
}
