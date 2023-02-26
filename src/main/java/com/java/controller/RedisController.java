package com.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface RedisController {

    @RequestMapping("/test/setStr")
    public String setStr();

    @RequestMapping("/test/getStr")
    public String getStr();

    @RequestMapping("/test/del")
    public String del();

    @RequestMapping("/test/expire")
    public String expire();

    @RequestMapping("/test/lock")
    public Boolean lock();

    @RequestMapping("/test/lockV2")
    public Boolean lockV2();

    @RequestMapping("/test/unLock")
    public Boolean unLock();
}
