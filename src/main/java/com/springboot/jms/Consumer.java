package com.springboot.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author: sunliang
 * @Description: Consumer
 * @Date: Created in 2018-07-03 15:58
 * @Modified By:
 */

@Component
public class Consumer {
    /**
     * 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
     * @param text
     */
    @JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text) {
        System.out.println("Consumer收到的报文为:"+text);

    }

}
