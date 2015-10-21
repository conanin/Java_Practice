package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 1:54:18 PM 
*/
public class NYClamPizza extends Pizza {
	
	private PizzaIngredientFactory factory;

	public NYClamPizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name );
		dough = factory.createDough();
		sause = factory.createSause();
		cheese = factory.createCheese();
		clam = factory.createClam();
	}

}
