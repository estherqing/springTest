package com.springTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasedTypeEquivalence {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2); // true	
		rtti(new LinkedList<Integer>());
		rtti(new ArrayList<>());
	}
	public static <E> void rtti(List<?> list) {
	    if (list instanceof ArrayList<?>) {  // compile-time error
	        System.out.println(list.getClass().getName());
	    }
	    if(list instanceof LinkedList<?>){
	    	System.out.println(list.getClass().getName());
	    }
	}
}
