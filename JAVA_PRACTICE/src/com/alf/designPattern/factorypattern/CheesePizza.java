package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 2:24:57 PM 
*/
public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory factory;
	
	public CheesePizza( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}

	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		dough = factory.createDough();
		sause = factory.createSause();
		cheese = factory.createCheese();
	}

}
