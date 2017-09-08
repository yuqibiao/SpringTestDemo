package com.yyyu.spring.pojo.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/9/8.
 */
public class MyAdvice {

    //前置通知
    public void before(){
        System.out.println("这是一个前置通知");
    }

    //后置通知
    public  void afterReturning(){
        System.out.println("这是一个后置通知（如果出现异常不会被调用）");
    }

    //环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("这是环绕通知之前的部分");
        Object proceed = pjp.proceed();
        System.out.println("这是环绕通知之后的部分");
        return proceed;
    }


    //异常通知
    public void afterException(){
        System.out.println("出现异常了---");
    }

    //后置通知2
    public void  after(){
        System.out.println("这是一个后置通知（如果出现异常也会被调用）");
    }



}
