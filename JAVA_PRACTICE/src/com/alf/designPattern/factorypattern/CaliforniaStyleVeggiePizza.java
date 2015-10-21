package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 9:52:17 AM 
*/
public class CaliforniaStyleVeggiePizza extends Pizza{

	PizzaIngredientFactory factory;
	
	public CaliforniaStyleVeggiePizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	@Override
	public void prepare() {
		dough = factory.createDough();
		sause = factory.createSause();
		veggies = factory.createVeggies();
	}
	
	/*
	public CaliforniaStyleVeggiePizza() {
		System.out.println( "**** " + this.getClass().getSimpleName() + " ****");
		name = "California Style Veggie Pizza";
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
}
