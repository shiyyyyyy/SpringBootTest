package com.syy.demo04mybatis1;

import com.syy.demo04mybatis1.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo04mybatisApplicationTests {

    @Autowired
    PersonDao dao;//Alt+Enter修复  disabled inspection
    @Test
    void test01() {
        System.out.println(dao.findAllPersons());
    }

}
