package com.example.demo_fresh;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
class DemoFreshApplicationTests {

    @Test
    void contextLoads() {
        log.error("Hi ! We have an Error. Hello World");
        log.warn("Hi ! You have an Warn. Hello World");
    }

}
