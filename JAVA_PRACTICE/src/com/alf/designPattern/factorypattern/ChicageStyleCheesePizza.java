package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 2:20:31 PM 
*/
public class ChicageStyleCheesePizza extends Pizza {
	private PizzaIngredientFactory factory;
	/*
	public ChicageStyleCheesePizza()
	{
		System.out.println( "**** " + this.getClass().getSimpleName() + " ****");
		name = "Chicage Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sause = "Plum Tomoto Sause";
		toppings.add("Shreded Mozzarella Cheese");
		toppings.add("Chicago Style Salt");
	}
	*/
	
	public ChicageStyleCheesePizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	@Override
	public void split()
	{
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Spliting the piiza into square slices.");
	}

	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		dough = factory.createDough();
		sause = factory.createSause();
		cheese = factory.createCheese();
	}
	
}
