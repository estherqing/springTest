package com.springTest;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(fun(12345678));

		int[] num1 = { 1, 2, 3, 4, 5, 6 };
		int[] num2 = { 1, 2, 3, 4 };
		int[] rlt = new int[6];

		int breakLength = 0;
		for (int i = 0; i < num1.length; i++) {
			// "num1的第"+(i+1)+"个数和num2的第+(breakLength+1)+"个数相乘"
			rlt[i] = num1[i] * num2[breakLength];
			System.out.println("num1的第" + (i + 1) + "个数和num2的第" + (breakLength + 1) + "个数相乘");
			// 如果num2到尾了，则置0
			if (breakLength < num2.length - 1) {
				breakLength++;
			} else {
				breakLength = 0;
			}
		}
		for (int i = 0; i < rlt.length; i++) {
			System.out.println(rlt[i]);
		}
	}

	public static String fun(int num) {
		if (num >= 10) {
			System.out.println(num % 10 + "," + num / 10);
			return (num % 10) + fun(num / 10);
		} else {
			return String.valueOf(num);
		}
	}
}
