package com.alf.designPattern.webchainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 9:56:50 AM 
*/
public interface Filter 
{
	public void doFilter( Request request, Response response, FilterChain chain );
}
