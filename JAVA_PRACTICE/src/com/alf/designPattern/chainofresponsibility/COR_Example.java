package com.alf.designPattern.chainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 9:58:34 AM 
*/
public class COR_Example 
{
	public static void main( String[] args )
	{
		String input = "Chain Of Responsibility";
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter( new HTMLTagFilter() )
				   .addFilter(new SpecialCharacterFilter());
		MessageProcessor sp = new MessageProcessor();
		sp.setFilterChain( filterChain );
		String result = sp.process(input);
		System.out.println( result );
	}
}
