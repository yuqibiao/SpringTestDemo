package com.yyyu.spring.pojo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/13.
 */
@Service("loginService")
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public LoginService(){

    }

    public void toLogin(){
        loginDao.login();
    }

}
