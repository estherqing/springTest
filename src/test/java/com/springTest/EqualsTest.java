package com.springTest;
 
import com.hsmdata.springTest.modules.entity.TestModel;

public class EqualsTest {
	public static void main(String[] args) {
		int i = 1, j = 1;
		System.out.println(i == j);
		String string = new String("hello");
		String string1 = new String("hello");
		String string2 = new String("hello");
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		string1 = string;
		string2 = string;
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));

		System.out.println("-----------");
		TestModel t = new TestModel();
		TestModel t1 = new TestModel();
		TestModel t2 = new TestModel();
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		t1 = t;
		t2 = t;
		System.out.println(t1.equals(t2));		 

	}
}
