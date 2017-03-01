package com.hsmdata.springTest.modules.aop;

public class LogHandler {
	public void LogBefore() {
		System.out.println("Log before method");
	}

	public synchronized void LogAfter() {
		System.out.println("Log after method");
	}
}
