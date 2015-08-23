/**
 * 
 */
package com.alf;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;

/**
 * @author yinga
 *
 */
public class MethodHandle_Example {

	static class classA
	{
		public void println(String s)
		{
			System.out.print(s);
		}
	}
	
	private static MethodHandle getPrintlnHM(Object receiver) throws NoSuchMethodException, IllegalAccessException
	{
		MethodType mt = MethodType.methodType(void.class,String.class);
		return MethodHandles.lookup().findVirtual(receiver.getClass(), "println", mt).bindTo(receiver);
	}
	/**
	 * @param args
	 * @throws Throwable 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, Throwable {
		// TODO Auto-generated method stub
		for ( int i = 0; i< 11 ; i ++  )
		{
			Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new classA();
			System.out.println(obj.getClass().getName());
			System.out.println(obj.getClass().getSimpleName());
			getPrintlnHM(obj).invoke("abc");
		}
		
	}

}
