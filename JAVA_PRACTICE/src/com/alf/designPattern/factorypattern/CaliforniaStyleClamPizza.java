package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 9:48:42 AM 
*/
public class CaliforniaStyleClamPizza extends Pizza{
	
	PizzaIngredientFactory factory;
	
	public CaliforniaStyleClamPizza(PizzaIngredientFactory _factory)
	{
		this.factory = _factory;
	}
	/*
	public CaliforniaStyleClamPizza()
	{
		System.out.println( "**** " + this.getClass().getSimpleName() + " ****");
		name = "California Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sause = "Plum Tomoto Sause";
		toppings.add("Shreded Mozzarella Cheese");
		toppings.add("California Style Sea Salt");
	}
	*/
	
	@Override
	public void bake()
	{
		System.out.println( this.getClass().getSimpleName() + " need to bake more time, maybe 45 minutes." );
	}

	@Override
	public void prepare() {
		System.out.println( "Preparing " + this.getClass().getSimpleName() );
		cheese = factory.createCheese();
		sause = factory.createSause();
		veggies = factory.createVeggies();
		dough = factory.createDough();
	}
}
