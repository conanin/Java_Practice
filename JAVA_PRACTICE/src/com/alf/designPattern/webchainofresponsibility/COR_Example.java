package com.alf.designPattern.webchainofresponsibility;
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
		Request request = new Request();
		request.setStrRequest( "Request before interceptor" );
		Response response = new Response();
		response.setStrResponse( "Response before interceptor" );
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter( new HTMLTagFilter() )
				   .addFilter(new SpecialCharacterFilter());
		filterChain.doFilter(request, response, filterChain);
		System.out.println( request.getStrRequest() );
		System.out.println( response.getStrResponse() );
	}
}
