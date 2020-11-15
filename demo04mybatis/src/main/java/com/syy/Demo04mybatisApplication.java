package com.syy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.syy.demo04mybatis.dao")
public class Demo04mybatisApplication {
    public static void main(String[] args){
        SpringApplication.run(Demo04mybatisApplication.class,args);
    }
}
