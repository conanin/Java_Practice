/**
 * 
 */
package com.alf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author yinga
 *
 */
public class Reflection_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reflected r = new reflected();
		Method method;
		//Usage: call method belong to unknown class.
		try
		{
			method = r.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(r);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Usage: Get class type name of the object.
		System.out.print(r.getClass().getName() + " aaa\n");
		
		Class<?> c = null;
		reflected ref01 = null;
		//Usage: Initialize class instance.
		try
		{
			c = Class.forName("com.alf.reflected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Usage: Initialize reflected instance.
		try{
			ref01 = (reflected)c.newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ref01.print();
		
		//Usage: Get construnctors and initialize the object.
		reflected ref02 = null;
		reflected ref03 = null;

		try{
			c = Class.forName("com.alf.reflected");
			Constructor<?> cons[] = c.getConstructors();
			System.out.println(cons.length);
			ref02 = (reflected)cons[0].newInstance();
			ref03 = (reflected)cons[1].newInstance("OMG");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ref02.printAttr();
		ref03.printAttr();
		
	}

}

class reflected
{
	String attr01;
	
	public reflected(){}
	
	public reflected(String attr01)
	{
		this.attr01 = attr01;
	}
	
	public void print()
	{
		System.out.println("This is print method in reflected class. \n");
	}
	
	public void printAttr()
	{
		System.out.println( attr01 );
	}
}