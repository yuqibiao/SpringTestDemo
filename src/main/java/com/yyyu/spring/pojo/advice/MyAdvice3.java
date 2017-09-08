package com.yyyu.spring.pojo.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//通知类
//表示该类是一个通知类
public class MyAdvice3 {
	@Pointcut("execution(* com.yyyu.spring.pojo.service.*ServiceImpl.save*(..))")
	public void pc(){}
	//前置通知
	//指定该方法是前置通知,并制定切入点
	@Before("MyAdvice3.pc()")
	public void before(){
		System.out.println("这是前置通知!!");
	}
}
