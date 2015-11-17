package com.alf.designPattern.chainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 9:57:45 AM 
*/
public class HTMLTagFilter implements Filter {

	@Override
	public String doFilter( String str ) 
	{
		System.out.println( this.getClass().getSimpleName() + "doFilter method." );
		return this.getClass().getSimpleName() + " " + str;
	}

}
