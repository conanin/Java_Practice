package com.alf.designPattern.webchainofresponsibility;

import java.util.*;

/**
 * @author: conanin
 * @E-mail: conanin@live.cn
 * @version:
 * @Creation date�� Nov 16, 2015 10:01:18 AM
 */
public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;

	private String input = null;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.alf.designPattern.chainofresponsibility.Filter#doFilter()
	 */

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public FilterChain removeFilter(Filter filter) {
		filters.remove(filters.indexOf(filter));
		return this;
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain ) {
		if( index == filters.size() )
		{
			return;
		}
		Filter filter = filters.get(index);
		index++;
		filter.doFilter(request, response, chain );
	}

}