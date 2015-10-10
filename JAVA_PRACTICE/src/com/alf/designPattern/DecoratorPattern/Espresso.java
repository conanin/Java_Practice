package com.alf.designPattern.DecoratorPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 4:48:24 PM 
*/
public class Espresso extends Beverage
{
	public Espresso()
	{
		description = "Espresso";
	}
	
	public Espresso( CoffeeSize coffeeSize )
	{
		this();
		this.coffeeSize = coffeeSize;
	}
	
	@Override
	public double cost() 
	{
		return 0.15;
	}
}
