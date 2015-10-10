package com.alf.TestConstructor;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 8, 2015 1:44:55 PM 
*/
public class superClass extends superSuperClass {
	protected int count;
	
	public String baseName = "superClass";
	
	public superClass()
	{
		System.out.println( "superClass constructor without param." );
		callName();
	}

	public superClass( int i )
	{
		System.out.println( "superClass constructor with param count." );
	}
	
	public void callName()
	{
		System.out.println( baseName );
	}
}
