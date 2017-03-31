package com.hsmdata.springTest.modules.staticaop;

public class Hello implements IHello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	@Override
	public void sayGoogBye(String name) {
		System.out.println(name + " Goodbye");
	}

	public void print(String name) {
		System.out.println("Print:" + name);
	}
}
