package com.xoste.leon.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Xoste
 */
public class MyAdvice {
    public void myBefore(String name, int age) {
        System.out.println("前置通知：name=" + name + "...age=" + age);
    }
    public void myAfterReturning() {
        System.out.println("后置myAfterReturning通知");
    }
    public void myAfter() {
        System.out.println("后置myAfter通知");
    }
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕myAround通知");
        System.out.println("环绕前置");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后置");
        return proceed;
    }
    public void myAfterThrowing() {
        System.out.println("myAfterThrowing通知");
    }
}
