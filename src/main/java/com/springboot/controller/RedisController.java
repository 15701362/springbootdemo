package com.springboot.controller;

import com.springboot.util.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/user/{id}")
    public Object user(@PathVariable("id") Long id){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("id",id);
        Map<Object, Object> usermap = redisUtil.hmget("usermap");
        Map<Object, Object> result = redisUtil.hmget("usermap");
        Set<Object> objects = usermap.keySet();
        for (Object obj :
                objects) {
            if (obj.toString().equals("id")){
                return usermap;
            }
        }
        return null;
    }
}
