package com.syy.demo3junit.impl;

import com.syy.demo3junit.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    @Override
    public void savePerson() {
        System.out.println("savePerson");
    }
}
