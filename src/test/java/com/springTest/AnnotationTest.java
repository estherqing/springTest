package com.springTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsmdata.springTest.modules.cglib.Hello;
import com.hsmdata.springTest.modules.mapper.DictMapper;
import com.hsmdata.springTest.modules.vo.DictVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/config/applicationContext.xml", "classpath:/config/spring-servlet.xml" })
public class AnnotationTest {
	@Autowired
	private DictMapper dictMapper;
	@Autowired
	private Hello hello;
	
	
	@Test
	public void sayHello(){
		hello.sayHello("esther");
		System.out.println("isJdkDynamicProxy:" + AopUtils.isJdkDynamicProxy(hello));
		System.out.println("isCglibProxy:" + AopUtils.isCglibProxy(hello));
	}

	@Test
	public void testDictList() {
		List<DictVo> list = dictMapper.getAllDictList();
		System.out.println(list);		 
	} 
	 
}
