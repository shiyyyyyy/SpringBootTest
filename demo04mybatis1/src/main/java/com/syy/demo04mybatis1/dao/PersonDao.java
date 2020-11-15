package com.syy.demo04mybatis1.dao;

import com.syy.demo04mybatis1.domain.Person;

import java.util.List;

public interface PersonDao {
    //全查
    List<Person> findAllPersons();
}
