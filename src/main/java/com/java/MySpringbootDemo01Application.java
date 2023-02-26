package com.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.java")
public class MySpringbootDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootDemo01Application.class, args);
    }

}
