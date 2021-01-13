package com.example.week13;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//PTP模式的消费者

@Component
public class PTPConsumer {

    //监听并读取消息msg
    @JmsListener(destination="${spring.activemq.queue-name}", containerFactory="queueListener")
    public void queue(String msg) {
        System.out.println("正在消费：" + msg);
    }
}