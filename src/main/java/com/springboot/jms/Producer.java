package com.springboot.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @Author: sunliang
 * @Description: Producer
 * @Date: Created in 2018-07-03 15:56
 * @Modified By:
 */

@Service("producer")
public class Producer {
    /**
     * 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
     */
    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    /**
     * 发送消息，destination是发送到的队列，message是待发送的消息
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, final String message) {
        jmsTemplate.convertAndSend(destination, message);

    }
}