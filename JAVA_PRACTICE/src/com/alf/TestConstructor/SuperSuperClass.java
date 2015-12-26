package com.alf.TestConstructor;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 8, 2015 1:42:28 PM 
*/
public class SuperSuperClass {
	protected int protectedCount = 1;
	private int privateCount = 2;
	static public int publicCount = 3;

	public SuperSuperClass()
	{
		System.out.println( "superSuperClass constructor without param." );
	}

	public SuperSuperClass( int i )
	{
		System.out.println( "superSuperClass constructor with param count." );
	}
}
