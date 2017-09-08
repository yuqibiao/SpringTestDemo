package com.yyyu.spring.pojo.service;

import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/9/8.
 */

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void save() {
        System.out.println("===============save");
    }

    @Override
    public void delete() {
        System.out.println("===============delete");
    }

    @Override
    public void update() {
        System.out.println("===============update");
        //throw new UnsupportedOperationException("123");
    }
}
