package com.hsmdata.springTest.modules.test;

import com.hsmdata.springTest.modules.decorator.Decorator;
import com.hsmdata.springTest.modules.decorator.Decorator_first;
import com.hsmdata.springTest.modules.decorator.Decorator_two;
import com.hsmdata.springTest.modules.decorator.Decorator_zero;
import com.hsmdata.springTest.modules.decorator.Human;
import com.hsmdata.springTest.modules.decorator.Person;

public class DecoratorTest {

	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
		decorator.wearClothes();
		decorator.walkToWhere();

	}

}
