/**
 * 
 */
package com.alf;

/**
 * @author yinga
 *
 */
public class StaticDispatch {
	
	static abstract class Human{}

	static class Man extends Human{}
	
	static class Woman extends Human{}
	
	public void sayHello(Human guy)
	{
		System.out.println("Hello, human");
	}
	
	public void sayHello(Man guy)
	{
		System.out.println("Hello, man");
	}
	
	public void sayHello(Woman guy)
	{
		System.out.println("Hello, woman");
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
		dd.sayHello(man);
		dd.sayHello(woman);
		System.out.println("--------------------------------------------------------------------");
		dd.sayHello((Man)man);
		dd.sayHello((Woman)woman);
	}

}