package com.hsmdata.springTest.modules.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsmdata.springTest.modules.aop.HelloWorld;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "classpath:/config/applicationContext.xml", "classpath:/config/spring-servlet.xml" })
public class aopTest {
	
	@Test
	public void test() {
		ApplicationContext ctx = 
	            new ClassPathXmlApplicationContext("spring-servlet.xml");
	        
	    HelloWorld hw1 = (HelloWorld)ctx.getBean("helloWorldImpl1");
	    HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
		//HelloWorld hw1 = new HelloWorldImp1();
		//HelloWorld hw2 = new HelloWorldImp2();
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}
}
