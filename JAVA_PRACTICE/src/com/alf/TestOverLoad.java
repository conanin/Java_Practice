package com.alf;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 9:15:15 AM 
*/
public class TestOverLoad {
	
	protected void max( int a, int b )
	{
		System.out.println( a > b ? a : b );
	}
	
	protected void max( byte a, byte b )
	{
		System.out.println( a > b ? a : b );
	}
	
//	public int max ( int a, int b )
//	{
//		return a > b ? a : b;
//	}
}
