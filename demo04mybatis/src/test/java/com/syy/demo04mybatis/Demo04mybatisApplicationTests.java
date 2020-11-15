package com.syy.demo04mybatis;

import com.syy.demo04mybatis.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo04mybatisApplicationTests {
    @Autowired
    PersonDao dao;

    @Test
    void test01() {
        System.out.println(dao.findAllPersons());
    }

}
