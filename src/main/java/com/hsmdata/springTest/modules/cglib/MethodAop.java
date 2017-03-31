package com.hsmdata.springTest.modules.cglib;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class MethodAop {
	@Before("execution(* sayHello(..))")
    public void before() {
        System.out.println("方法调用前。。。。。。。");
    }
}
