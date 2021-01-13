package com.example.week13;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

// 发布订阅模式的消费者
@Component
public class PubSubConsumer {

    //监听并读取消息msg
    @JmsListener(destination = "${spring.activemq.topic-name}", containerFactory = "topicListener")
    public void topic1(String msg) {
        System.out.println("消费者1 正在消费：" + msg);
    }

    @JmsListener(destination = "${spring.activemq.topic-name}", containerFactory = "topicListener")
    public void topic2(String msg) {
        System.out.println("消费者2 正在消费：" + msg);
    }

}