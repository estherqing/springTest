package com.springTest;


public class Test extends Thread {
    private String sThreadName;
 
    public static void main(String argv[]) {
        Test h = new Test();
        h.go();
    }
 
    Test() {
    }
 
    Test(String s) {
        sThreadName = s;
    }
 
    public String getThreadName() {
        return sThreadName;
    }
 
    public void go() {
        Test first = new Test("first");
        first.start();
        Test second = new Test("second");
        second.start();
    }
 
    public void start() {//换成run()试试
        for (int i = 0; i < 2; i++) {
            System.out.println(getThreadName() + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
