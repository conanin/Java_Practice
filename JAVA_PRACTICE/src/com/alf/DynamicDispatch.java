/**
 * 
 */
package com.alf;

import com.alf.StaticDispatch.Human;
import com.alf.StaticDispatch.Man;
import com.alf.StaticDispatch.Woman;

/**
 * @author yinga
 *
 */
public class DynamicDispatch {

	static abstract class Human{
		protected abstract void sayHello();
	}

	static class Man extends Human{
		@Override
		public void sayHello()
		{
			System.out.println("Hello, man");
		}
	}
	
	static class Woman extends Human{
		@Override
		public void sayHello()
		{
			System.out.println("Hello, woman");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Human man = new Man();
		System.out.println(man.getClass().getName());
		Human woman = new Woman();
		System.out.println(woman.getClass().getName());
		System.out.println("--------------------------------------------------------------------");
		StaticDispatch dd = new StaticDispatch();
		//JVM judge parameter type depend on static type rather than actural type using overload.
		//Static dispatch: identify method call version depend on static type, classic example is overload.
		man.sayHello();
		woman.sayHello();
		System.out.println("--------------------------------------------------------------------");
	}

}
