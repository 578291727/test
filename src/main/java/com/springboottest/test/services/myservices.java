package com.springboottest.test.services;

import com.springboottest.test.been.informayion;
import com.springboottest.test.dao.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 @author 彭伟
 @version 1.0 */
@Service
public class myservices {
    @Autowired
 MyMapper myMapper;
public ArrayList<informayion> getname(String name){
   return myMapper.selectUserByName(name);
};



}
