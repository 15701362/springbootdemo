package com.springboot.util.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MapRedisTemplateTest {
    @Autowired
    private MapRedisTemplate mapRedisTemplate;
    @Test
    public void hasKey() throws Exception {
        mapRedisTemplate.hasKey("name","sunliang");
        Long key = mapRedisTemplate.size("key");
        System.out.println(key);
    }

    public static void main(String[] args) {
        MapRedisTemplate mapRedisTemplate = new MapRedisTemplate();
        mapRedisTemplate.hasKey("name","sunliang");
        Long key = mapRedisTemplate.size("key");
        System.out.println(key);
    }

}