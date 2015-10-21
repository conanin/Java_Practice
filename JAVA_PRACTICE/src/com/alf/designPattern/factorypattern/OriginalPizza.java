package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 3:24:34 PM 
*/
public class OriginalPizza extends Pizza{
	
	PizzaIngredientFactory factory;
	
	public OriginalPizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	/*
	public OriginalPizza()
	{
		System.out.println( "**** " + this.getClass().getSimpleName() + " ****");
		name = "Original Pizza";
		dough = "Original Dough";
		sause = "Original Sause";
		toppings.add("Fist Original toppings");
		toppings.add("Second Original toppings");
	}
	*/
	
	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		name = "Original Pizza";
		dough = factory.createDough();
		sause = factory.createSause();
	}
}
