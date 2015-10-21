package com.alf.designPattern.decoratorpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 30, 2015 9:13:44 AM 
*/
public class DarkRoast extends Beverage
{
	public String getDescription()
	{
		this.description = "DarkRoast";
		return description;
	}
	
	@Override
	public double cost() {
		return 0.35;
	}
	
}
