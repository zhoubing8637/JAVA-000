package com.example.week13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
//启动消息队列
@EnableJms
public class MQDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MQDemoApplication.class, args);
    }

}
