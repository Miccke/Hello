package com.example.hello.dao;

import com.example.hello.entity.TblUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create By Miccke(煎饼)
 * Create Time 2018/9/26 16:05
 */
@Mapper
public interface TblUserDao {

    List<TblUser> queryList();

}
