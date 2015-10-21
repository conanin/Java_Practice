package com.alf.designPattern.decoratorpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 4:50:15 PM 
*/
public class HouseBlend extends Beverage{
	public HouseBlend()
	{
		description = "HouseBlend";
	}

	@Override
	public double cost() 
	{
		return 0.25;
	}
}