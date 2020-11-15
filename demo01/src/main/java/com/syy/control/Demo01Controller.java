package com.syy.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo01Controller {
    @RequestMapping(path = "/demo01",method = {RequestMethod.GET,RequestMethod.GET})
    public @ResponseBody
    String demo01(){
        return "HelloWorld!!!";
    }
}
