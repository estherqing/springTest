package com.hsmdata.springTest.modules.staticaop.decoupling;

import java.lang.reflect.Method;

import com.hsmdata.springTest.modules.staticaop.Level;
import com.hsmdata.springTest.modules.staticaop.Logger;

public class LoggerOperation implements IOperation {

	@Override
	public void start(Method method) { 
		  Logger.logging(Level.DEBUGE, method.getName() + " Method Start!"); 

	}

	@Override
	public void end(Method method) { 
		  Logger.logging(Level.DEBUGE, method.getName() + " Method End!"); 
 }

}
