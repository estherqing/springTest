package com.hsmdata.springTest.modules.decorator2;

public abstract class Humburger {
	protected  String name ;    
    
    public String getName(){    
        return name;    
    }    
        
    public abstract double getPrice();   
}
