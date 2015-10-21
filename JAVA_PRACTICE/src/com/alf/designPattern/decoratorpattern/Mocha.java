package com.alf.designPattern.decoratorpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 4:53:08 PM 
*/
public class Mocha extends CondimentDecorator{

	protected Beverage beverage;
	
	public Mocha(Beverage _beverage)
	{
		this.beverage = _beverage;
	}
	
	@Override
	public String getDescription() 
	{
		return this.beverage.getDescription() + "\t with Mocha.";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
	

}
