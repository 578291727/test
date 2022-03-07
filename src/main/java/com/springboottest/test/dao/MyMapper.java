package com.springboottest.test.dao;

/**
 @author 彭伟
 @version 1.0 */

import com.springboottest.test.been.informayion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mapper
@Repository
public interface MyMapper {

    Integer  inser(informayion informayion);
    ArrayList<informayion> selectUserByName(@Param("name") String sname);

}
