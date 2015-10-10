package com.alf.TestConstructor;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 8, 2015 1:45:43 PM 
*/
public class subClass extends superClass {
	protected int count;
	
	public String baseName = "subClass";
	
	/*
	public subClass()
	{
		System.out.println( "subClass constructor without param." );
	}
	

	public subClass( int i )
	{
		super(200);
		System.out.println( "subClass constructor with param count." );
	}
	*/
	public void callName()
	{
		System.out.println( baseName );
	}

}
