package com.hsmdata.springTest.modules.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsmdata.springTest.modules.aop.HelloWorld;

public class aopTest {

	// @Test
	public static void main(String[] args) {

		String[] xmls = { "/config/spring-servlet.xml", "/config/applicationContext.xml" };
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext(xmls);

		HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorldImp1");
		HelloWorld hw2 = (HelloWorld) ctx.getBean("helloWorldImp2");		
		
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}
}
