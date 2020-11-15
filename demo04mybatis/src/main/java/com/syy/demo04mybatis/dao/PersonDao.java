package com.syy.demo04mybatis.dao;

import com.syy.demo04mybatis.domain.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAllPersons();
}
