package com.hsmdata.springTest.modules.test;

import com.hsmdata.springTest.common.utils.HttpClientUtil;

public class TestController {

	public static void main(String[] args) {
		test();
	}

	// @SuppressWarnings("unused")
	private static void test() {
		String url = "http://localhost:8080/springTest/test/testinfo.do";
		HttpClientUtil.sendHttpsGet(url);
	}
}
