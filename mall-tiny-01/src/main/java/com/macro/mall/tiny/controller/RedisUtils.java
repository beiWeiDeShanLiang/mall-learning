package com.macro.mall.tiny.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    RedisTemplate<String,Object> redisTemplate;
    private void redisUtils(){

        redisTemplate.expire("name",1212L, TimeUnit.MILLISECONDS);

    }
}
