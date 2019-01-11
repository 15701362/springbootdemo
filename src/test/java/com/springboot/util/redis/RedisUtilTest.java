package com.springboot.util.redis;

import com.config.redis.RedisConfig;
import com.springboot.entity.Brand;
import com.springboot.service.BrandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testConnection() {
        JedisPoolConfig jedisPoolConfig = redisConfig.jedisPoolConfig();
        System.out.println(jedisPoolConfig.getMaxIdle());
    }

    @Test
    public void testSet() {
        redisUtil.set("username", "admin");
        Assert.assertTrue(true);
        System.out.println(redisUtil.get("username"));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("demo" + i + "");
        }

    }

    @Test
    public void testLSet() {

        for (int i = 0; i < 100; i++) {
            redisUtil.lSet("my_test", "demo" + i + "");
        }

    }

    @Test
    public void testLGet() {
        List<Object> memberList = redisUtil.lGet("my_test", 1, 10);
        for (Object object : memberList) {
            System.out.println(object.toString());
        }

    }

    @Test
    public void testLGetIndex() {
        Object memberList = redisUtil.lGetIndex("memberList", 1);
        System.out.println(memberList);
    }

    @Test
    public void testDel() {
        redisUtil.del("memberList");
    }

    @Test
    public void testHmSet() {
        Map<String, Object> user = new HashMap<String, Object>();
        user.put("username", "admin");
        user.put("id", 1);
        user.put("password", "123");
        redisUtil.hmset("usermap", user);
    }

    @Test
    public void testHmGet() {
        Map<Object, Object> usermap = redisUtil.hmget("usermap");
        Set<Object> objects = usermap.keySet();
        for (Object obj :
                objects) {
            System.out.println(obj.toString() + ":" + usermap.get(obj.toString()));
        }
    }
}