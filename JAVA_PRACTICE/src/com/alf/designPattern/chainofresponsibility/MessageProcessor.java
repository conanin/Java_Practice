package com.alf.designPattern.chainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 10:28:22 AM 
*/
public class MessageProcessor 
{
	private FilterChain filterChain = new FilterChain();
	private String message = "";
	
	public FilterChain getFilterChain() 
	{
		return filterChain;
	}
	public void setFilterChain(FilterChain filterChain) 
	{
		this.filterChain = filterChain;
	}
	
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public String process( String message )
	{
		return filterChain.doFilter(message);
		
	}
}
