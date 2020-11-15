package com.syy.demo04mybatis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.syy.demo04mybatis1.dao")//存放接口
public class Demo04mybatis1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo04mybatis1Application.class, args);
    }

}
