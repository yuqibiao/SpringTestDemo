package com.yyyu.spring.pojo.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/13.
 */
@Repository("loginDao")
public class LoginDao {

    @Value("使用注解注入默认值")
    private String tip;

    public void login(){
        System.out.println("查询数据库，实现登录操作。tip="+tip);
    }

    @PostConstruct
    public void init(){
        System.out.println("配置init方法=======");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("配置destroy方法=======");
    }

}
