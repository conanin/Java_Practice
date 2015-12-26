package com.alf.TestConstructor;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date锛�Oct 8, 2015 1:44:55 PM 
*/
public class SuperClass extends SuperSuperClass {
	protected int count;
	
	public String baseName = "superClass";
	
	public SuperClass()
	{
		System.out.println( "superClass constructor without param." );
		callName();
	}

	public SuperClass( int i )
	{
		System.out.println( "superClass constructor with param count." );
	}
	
	public void callName()
	{
		System.out.println( baseName );
	}
}
