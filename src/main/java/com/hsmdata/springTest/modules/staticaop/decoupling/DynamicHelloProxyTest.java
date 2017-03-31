package com.hsmdata.springTest.modules.staticaop.decoupling;

import com.hsmdata.springTest.modules.staticaop.Hello;
import com.hsmdata.springTest.modules.staticaop.IHello;

public class DynamicHelloProxyTest {

	public static void main(String[] args) {
		IHello iHello=(IHello) new DynamicHelloProxy().bind(new LoggerOperation(),new Hello());
		iHello.sayHello("esther");
		iHello.sayGoogBye("esther"); 
	}			

}
