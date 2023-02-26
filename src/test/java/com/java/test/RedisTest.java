package com.java.test;

import com.java.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Test
    public void test01(){
        RedisUtil redisUtil = new RedisUtil();
        Object glenn = redisUtil.get("Glenn");
        System.out.println(glenn);
    }
}
