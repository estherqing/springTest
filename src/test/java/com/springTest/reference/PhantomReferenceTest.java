package com.springTest.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

	public static void main(String[] args) {
		String str = new String("hello world!");// "hello world!";
		ReferenceQueue<String> rq = new ReferenceQueue<String>();
		PhantomReference<String> pr = new PhantomReference<String>(str, rq);
		str = null;
		System.out.println(pr.get());
		// 通知系统进行垃圾回收
		System.gc();
		System.runFinalization();
		// 垃圾回收机制运行之后，SoftReference数组里的元素保持不变
		System.out.println(rq.poll() == pr);
	}

}
