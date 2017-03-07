package com.springTest;

public class A {

	 /**
     * 静态方法
     */
    public synchronized static void staticMethod(){}
     
    /**
     * 实例方法
     */
    public synchronized void instanceMethod(){}
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         
        //A实例的创建过程
        @SuppressWarnings("rawtypes")
		Class c = Class.forName("com.springTest.A");
       //@SuppressWarnings("unused")
		@SuppressWarnings("unused")
		A a1 =  (A) c.newInstance();
        @SuppressWarnings("unused")
		A a2 = (A) c.newInstance();
        @SuppressWarnings("unused")
		A a3 =  (A) c.newInstance();
         
 
    }

}