package com.hsmdata.springTest.modules.staticaop;

public class DynamicHelloProxyTest {

	public static void main(String[] args) {
		IHello iHello=(IHello) new DynamicHelloProxy().bind(new Hello());
		iHello.sayHello("esther");
		iHello.sayGoogBye("esther"); 
	}

}
