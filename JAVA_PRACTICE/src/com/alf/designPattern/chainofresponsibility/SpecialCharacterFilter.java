package com.alf.designPattern.chainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 10:00:15 AM 
*/
public class SpecialCharacterFilter implements Filter {

	@Override
	public String doFilter( String str ) 
	{
		System.out.println( this.getClass().getSimpleName() + "doFilter method." );
		return this.getClass().getSimpleName() + " " + str;
	}
}
