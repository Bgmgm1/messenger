package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessengerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessengerServerApplication.class, args);
    }

}
