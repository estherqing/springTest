package com.springTest.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		WeakReference<Person2>[] people=new WeakReference[100];
		for(int i=0;i<people.length;i++){
			people[i]=new WeakReference<Person2>(new Person2("name"+i, (i+1)*4%100));
		}
		System.out.println(people[2].get());
		System.out.println(people[4].get());
		//通知系统进行垃圾回收
		System.gc();
		System.runFinalization();
		//垃圾回收机制运行之后，SoftReference数组里的元素保持不变
		System.out.println(people[2].get());
		System.out.println(people[4].get());
	}

}
