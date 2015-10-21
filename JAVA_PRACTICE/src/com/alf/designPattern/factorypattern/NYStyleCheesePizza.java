package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 2:20:31 PM 
*/
public class NYStyleCheesePizza extends Pizza {
	PizzaIngredientFactory factory;
	
	/*
	public NYStyleCheesePizza()
	{
		name = "NY Style Sause and Cheese Pizza";
		dough = "Thin Crust Dough";
		sause = "Marinara Sause";
		toppings.add("Grated Reggiano Cheese");
		toppings.add("NY Style Spicy Juice");
	}
	*/
	public NYStyleCheesePizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}

	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		cheese = factory.createCheese();
		clam = factory.createClam();
		dough = factory.createDough();
		sause = factory.createSause();
		
	}
}
