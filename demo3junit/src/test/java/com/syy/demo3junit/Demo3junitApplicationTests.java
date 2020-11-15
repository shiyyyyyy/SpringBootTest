package com.syy.demo3junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3junitApplicationTests {
    @Autowired
    private IPersonService service;
    @Test
    void contextLoads() {
        service.savePerson();
    }

}
