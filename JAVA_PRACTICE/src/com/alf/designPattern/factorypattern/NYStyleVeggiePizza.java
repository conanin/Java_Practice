package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 3:17:27 PM 
*/
public class NYStyleVeggiePizza extends Pizza {
	
	PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
	
	public NYStyleVeggiePizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	/*
	public NYStyleVeggiePizza() {
		System.out.println( "**** " + this.getClass().getSimpleName() + " ****");
		name = "Veggie Pizza";
		dough = "Crust";
		sause = "Marinara sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}
	*/

	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		dough = factory.createDough();
		sause = factory.createSause();
	}
}
