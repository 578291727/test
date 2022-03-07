package com.springboottest.test.controller;

import com.springboottest.test.been.informayion;
import com.springboottest.test.services.myservices;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 @author 彭伟
 @version 1.0 */
@Controller
public class MyController {

    @Autowired
    myservices myservices;

    @GetMapping(value = "/get")
    public String  getuser(Model model)
    {
        System.out.println("4444");
        model.addAttribute("list" ,myservices.getname("1"));
        return "hellow" ;

    }
}
