package com.hsmdata.springTest.modules.test;

 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

 import com.hsmdata.springTest.common.utils.DateUtils;
import com.hsmdata.springTest.common.utils.HttpClientUtil;
 import com.hsmdata.springTest.modules.entity.TestModel;

public class BinderTest {
	public static void main(String[] args) {
		testBinder();
		//test();
	}

	// @SuppressWarnings("unused")
	private static void testBinder() { 
		//String url = "http://localhost:8080/springTest/binder/testClass.do?age=10&name=jack";
		String url = "http://localhost:8080/springTest/login.do?username=jack";
		HttpClientUtil.sendHttpsGet(url);
	}

	@SuppressWarnings("unused")
	private static void test() {
	 
		TestModel tm = new TestModel();
		BeanWrapper bw = new BeanWrapperImpl(tm);
		bw.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		bw.setPropertyValue("birth", "2016-01-01");
		// bw.setPropertyValue("good", "on");
		bw.setPropertyValue("good", "1");
		// bw.setPropertyValue("good", "true");
		// bw.setPropertyValue("good", "yes");
		double days = DateUtils.getDistanceOfTwoDate(tm.getBirth(), new Date());
		System.out.println(tm);
		System.out.println(days);
	 
	}

}
