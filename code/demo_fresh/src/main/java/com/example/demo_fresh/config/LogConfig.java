package com.example.demo_fresh.config;

import com.example.demo_fresh.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo_fresh.config")
public class LogConfig {

    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public String logMethod() {
        LOG.info("==========print log==========");
        return "你好!";
    }
}
