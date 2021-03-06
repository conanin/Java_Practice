package com.alf.designPattern.webchainofresponsibility;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date�� Nov 16, 2015 9:57:45 AM 
*/
public class HTMLTagFilter implements Filter 
{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) 
	{
		request.setStrRequest( request.getStrRequest() + "\t" + this.getClass().getSimpleName() );
		chain.doFilter(request, response, chain);
		response.setStrResponse( response.getStrResponse() + "\t" + this.getClass().getSimpleName() );
	}
}
