package com.java.controller.impl;

import com.java.controller.RedisController;
import com.java.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RedisControllerImpl implements RedisController {

    private static final Logger log = LoggerFactory.getLogger(RedisControllerImpl.class);

    public static final String REDIS_KEY = "test_key";


    public String setStr() {
        new RedisUtil().set(REDIS_KEY, "set Str");
        return "success";
    }

    public String getStr() {
        Object o = new RedisUtil().get(REDIS_KEY);
        log.info("[Glenn-spring-boot-test][RedisController][getStr][o={}]", o);
        return o.toString();
    }

    public String del() {
        RedisUtil.del(REDIS_KEY);
        return "success";
    }

    public String expire() {
        new RedisUtil().expire(REDIS_KEY, 10l);
        return "success";
    }

    @Override
    public Boolean lock() {
        return null;
    }

    @Override
    public Boolean lockV2() {
        return null;
    }

    @Override
    public Boolean unLock() {
        return null;
    }
}
