package com.hsmdata.springTest.modules.staticaop;

public class HelloProxyTest {

	public static void main(String[] args) {
		//hello对象是被HelloProxy这个所谓的代理态所创建的
		IHello iHello = new HelloProxy(new Hello());
		iHello.sayHello("esther");
		iHello.sayGoogBye("esther"); 
	}

}
