package com.example.hello.controller;

import com.example.hello.entity.TblUser;
import com.example.hello.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By Miccke(煎饼)
 * Create Time 2018/9/26 16:06
 */
@RestController
@RequestMapping("/user")
public class TblUserController {

    @Autowired
    private TblUserService tblUserService;

    @GetMapping("/queryList")
    public List<TblUser> queryList(){
        return this.tblUserService.queryList();
    }


}
