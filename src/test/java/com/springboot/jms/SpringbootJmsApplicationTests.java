package com.springboot.jms;

import com.google.gson.Gson;
import com.springboot.domain.Brand;
import com.springboot.service.BrandService;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTests {

    @Autowired
    private Producer producer;
    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("mytest.queue");

        for (int i = 0; i < 100; i++) {
            producer.sendMessage(destination, "myname is sunliang!!!");
        }
    }

    @Test
    public void loadBrand() throws InterruptedException {
        Destination destination = new ActiveMQQueue("mytest.queue");
        Brand brand = brandService.selectByPrimaryKey(1L);
        Gson gson = new Gson();
        producer.sendMessage(destination, gson.toJson(brand));
    }


}