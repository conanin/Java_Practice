/**
 * 
 */
package com.alf;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author yinga
 *
 */
public class InvokeDynamic_Example {

	public static void testMethod(String s)
	{
		System.out.println("Dynamic String: \t" + s );;
	}
	/**
	 * @param args
	 * @throws Throwable 
	 * @throws TypeNotPresentException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, TypeNotPresentException, Throwable {
		// TODO Auto-generated method stub
		INDY_BootStrapMethod().invokeExact("ɬ��");

	}

	public static CallSite BootStrapMethod(MethodHandles.Lookup lookup, String name, MethodType mt) throws NoSuchMethodException, IllegalAccessException
	{
		return new ConstantCallSite(lookup.findStatic(InvokeDynamic_Example.class, name, mt));
	}
	
	private static MethodType MT_BootStrapMethod()
	{
		return MethodType.fromMethodDescriptorString("(Ljava/lang/invokeMethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", null);
	}
	
	private static MethodHandle MH_BootstrapMethod() throws NoSuchMethodException, IllegalAccessException
	{
		return MethodHandles.lookup().findVirtual(InvokeDynamic_Example.class, "BootStrapMethod", MT_BootStrapMethod());
	}
	
	private static MethodHandle INDY_BootStrapMethod() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, TypeNotPresentException, Throwable
	{
		CallSite cs = (CallSite)MH_BootstrapMethod().invokeWithArguments(MethodHandles.lookup(),"testMethod",MethodType.fromMethodDescriptorString("(Ljava/lang/String;)V", null));
		return cs.dynamicInvoker();
	}
}
