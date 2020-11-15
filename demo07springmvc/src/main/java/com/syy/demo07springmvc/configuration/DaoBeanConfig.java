package com.syy.demo07springmvc.configuration;

import com.syy.demo07springmvc.domain.Person;
import org.springframework.context.annotation.Bean;

public class DaoBeanConfig {
    @Bean //将当前方法的返回值，放到ioc容器
    public Person getPerson(){
        //一般不是@Service @Repository @Controller
        Person person = new Person();
        person.setPassword("123456");
        person.setUsername("root");
        return person;
    }
}
