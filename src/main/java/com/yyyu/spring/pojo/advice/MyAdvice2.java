package com.yyyu.spring.pojo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 功能：注解的方式
 *
 * @author yu
 * @date 2017/9/8.
 */

@Aspect
public class MyAdvice2 {

    @Pointcut("execution(* com.yyyu.spring.pojo.service.*ServiceImpl.save*(..))")
    public void pc0(){

    }

    @Pointcut("execution(* com.yyyu.spring.pojo.service.*ServiceImpl.update*(..))")
    public void pc1(){

    }

    @Pointcut("execution(* com.yyyu.spring.pojo.service.*ServiceImpl.delete*(..))")
    public void pc2(){

    }

    //前置通知
    @Before("pc0()")
    public void before(){
        System.out.println("这是一个--注解--前置通知");
    }

    //后置通知
    @AfterReturning("pc1()")
    public  void afterReturning(){
        System.out.println("这是一个--注解--后置通知（如果出现异常不会被调用）");
    }

    //环绕通知
    @Around("pc2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("这是--注解--环绕通知之前的部分");
        Object proceed = pjp.proceed();
        System.out.println("这是--注解--环绕通知之后的部分");
        return proceed;
    }


    //后置通知2
    @After("pc1()")
    public void  after(){
        System.out.println("这是一个后置通知（如果出现异常也会被调用）");
    }



}
