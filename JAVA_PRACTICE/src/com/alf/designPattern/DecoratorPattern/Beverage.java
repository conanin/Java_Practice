package com.alf.designPattern.DecoratorPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 29, 2015 4:44:21 PM 
*/
public abstract class Beverage {
	
	public abstract double cost();
	
	public CoffeeSize coffeeSize;
	
	public CoffeeSize getCoffeeSize() {
		return coffeeSize;
	}

	public void setCoffeeSize(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
	}

	public String description = "Basic Beverage";
	
	public String getDescription()
	{
		return description;
	}


}
