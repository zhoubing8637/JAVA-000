package com.example.week11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.week11.service.PublishOrder;
import com.example.week11.service.SubscribeOrder;
import redis.clients.jedis.JedisPool;
@SpringBootApplication(scanBasePackages = "com.example.week11")
public class Week11Application {

    public static void main(String[] args) {

        SpringApplication.run(Week11Application.class, args);
        JedisPool jedisPool = new JedisPool();
        String channelName = "ORDER";

        SubscribeOrder subscribeOrder = new SubscribeOrder(jedisPool, channelName);
        PublishOrder publishOrder = new PublishOrder(jedisPool, channelName);
    }

}

