package com.syy.demo07springmvc.controller;

import com.syy.demo07springmvc.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Demo01Controller {
    @RequestMapping(path="/test01",method = RequestMethod.GET)
    public @ResponseBody//将结构转成json,如果不能转，就显示字符串
    String test01(){
        return "hello";
    }
    @RequestMapping(path = "/test02",method = RequestMethod.GET)
    public @ResponseBody
    Person test02(){
        Person person = new Person();
        person.setUsername("root");
        person.setPassword("123456");
        return person;
    }
    @RequestMapping(path = "/test03",method = RequestMethod.GET)
    public @ResponseBody
    Person test03(){
        Person person = new Person();
        person.setUsername("restcontroller");
        person.setPassword("12345");
        return person;
    }

}
