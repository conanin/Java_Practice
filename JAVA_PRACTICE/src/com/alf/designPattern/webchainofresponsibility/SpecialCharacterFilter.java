package com.alf.designPattern.webchainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 16, 2015 10:00:15 AM 
*/
public class SpecialCharacterFilter implements Filter 
{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) 
	{
		request.setStrRequest( request.getStrRequest() + "\t" + this.getClass().getSimpleName() );
		chain.doFilter(request, response, chain);
		response.setStrResponse( response.getStrResponse() + "\t" + this.getClass().getSimpleName() ); 
	}
}