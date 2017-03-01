package com.springTest.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThroughHole {
	static Object hole = new Object();

	public static void main(String[] args) {
		Random r = new Random();
		String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		List<String> list = Arrays.asList(names);

		List<String> nameList = new ArrayList<String>(Arrays.asList(names));

		while (nameList.size() > 0) {
			int i = r.nextInt(nameList.size());
			final String name = nameList.remove(i);
			System.out.println(name + " is starting");
			new Thread(new Runnable() {

				@Override
				public void run() {
					synchronized (hole) {
						System.out.println(name + ": is throughing");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

		}

	}
}
