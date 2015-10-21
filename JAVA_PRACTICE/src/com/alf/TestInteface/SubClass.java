package com.alf.TestInteface;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 9:47:00 AM 
*/
public class SubClass implements Interface_A, Interface_B{

	@Override
	public void method_B() {
		Field[] fields = this.getClass().getFields();
		for( Field f : fields )
		{
			System.out.println( f.getModifiers() + " " + f.getName());
		}
	}

	@Override
	public void method_1() {
		System.out.println( Interface_A.count );
		
	}

	@Override
	public void method_A() {
		Method[] methods;
		methods = this.getClass().getDeclaredMethods();
		for( Method m: methods)
		{
			System.out.println(m.getModifiers());
			System.out.println(m.getReturnType());
			System.out.println(m.getName());
		}
	}

	@Override
	public void concreteMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method_C() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
