package com.alf.designPattern.templatepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 30, 2015 1:49:12 PM 
*/
public class BlackTea extends CaffeineBeverage{

	@Override
	public void addCondiments() {
		System.out.println( this.getClass().getSimpleName() + " specific step for: add lemon." );
	}

	@Override
	public void brew() 
	{
		System.out.println( this.getClass().getSimpleName() + " specific step for: brew." );
	}
	
	public boolean customWantsCondiments()
	{
		String answer = d();
		
		if( answer.toLowerCase().equals("yes") ||answer.toLowerCase().equals("y") )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private String d() {
		String answer = "";
		System.out.println( "Would you like condiment with your tea? " );
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ));
		try {
			answer = in.readLine();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		if(answer.equals(null))
		{
			return "no";
		}
		return answer;
	}
}