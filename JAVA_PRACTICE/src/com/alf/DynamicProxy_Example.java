/**
 * 
 */
package com.alf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yinga
 *
 */
public class DynamicProxy_Example {

	interface IHello{
		void sayHello();
	}
	
	static class Hello implements IHello{
		public void sayHello()
		{
			System.out.println("Hello, World");
		}
	}
	
	static class DynamicProxy implements InvocationHandler{
		Object originalObj;
		Object bind(Object originalObj)
		{
			this.originalObj = originalObj;
			return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(), originalObj.getClass().getInterfaces(), this);
		}
		
		@Override
		public Object invoke(Object obj, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
		{
			System.out.printf("Welcome,\n");
			return method.invoke(originalObj, args);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHello hello = (IHello)new DynamicProxy().bind(new Hello());
		hello.sayHello();
	}

}
