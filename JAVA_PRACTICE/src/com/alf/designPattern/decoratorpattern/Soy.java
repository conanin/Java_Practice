package com.alf.designPattern.decoratorpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 5:05:36 PM 
*/
public class Soy extends CondimentDecorator
{
	public Beverage beverage;
	
	public Soy( Beverage _beverage )
	{
		this.beverage = _beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + "\t with soy.";
	}

	@Override
	public double cost() {
		return 0.3 + beverage.cost();
	}
}
