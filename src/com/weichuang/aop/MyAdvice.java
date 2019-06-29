package com.weichuang.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

    //前置通知
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知
    public void afterReturning(){
        System.out.println("后置通知，可正常返回的");
    }

    //环绕通知
    public Object around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("前环绕通知");
        Object proceed = pj.proceed();
        System.out.println("后环绕通知");
        return proceed;
    }

    //异常通知
    public void afterThrowing(){
        System.out.println("异常通知");
    }
    //最终通知
    public void after(){
        System.out.println("最终通知");
    }
}
