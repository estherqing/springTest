package com.springTest;
 

public class MyTest {

	public static void main(String[] args) {
		Test test = new Test();
		// test.testFinal();
		Test test1 = test;
		Test test2 = test;
		System.out.println(test1.equals(test2));
		System.out.println(test1.hashCode() + "," + test2.hashCode());
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println(s1.equals(s2));
		System.out.println(s2.hashCode() + "," + s2.hashCode());
		System.out.println(test.getString() + "," + testFun(test));

		System.out.println(Math.round(11.6) + "," + Math.round(-11.6));
	}

	static String testFun(Test test) {
		test.setString("name");
		return test.getString();
	}

}

class Test {
	String string = "age";

	public String message() {
		System.out.println("returned");
		return "123";
	}

	public String testFinal() {
		try {
			return message();
		} catch (Exception e) {
			e.printStackTrace();
			return "exception";
		} finally {
			System.out.println("do finally");
		}
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}