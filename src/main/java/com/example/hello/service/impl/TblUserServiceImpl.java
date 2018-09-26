package com.example.hello.service.impl;

import com.example.hello.dao.TblUserDao;
import com.example.hello.entity.TblUser;
import com.example.hello.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By Miccke(煎饼)
 * Create Time 2018/9/26 16:03
 */
@Service("TblUserService")
public class TblUserServiceImpl implements TblUserService {

    @Autowired
    private TblUserDao tblUserDao;

    @Override
    public List<TblUser> queryList() {
        return this.tblUserDao.queryList();
    }
}
