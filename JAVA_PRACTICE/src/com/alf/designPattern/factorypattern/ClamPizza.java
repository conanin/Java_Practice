package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 2:59:40 PM 
*/
public class ClamPizza extends Pizza {
	PizzaIngredientFactory factory;
	
	public ClamPizza(PizzaIngredientFactory _factory)
	{
		this.factory = _factory;
	}
	
	@Override
	public void prepare() {
		System.out.println( "Preparing " + name );
		dough = factory.createDough();
		sause = factory.createSause();
		cheese = factory.createCheese();
		clam = factory.createClam();
	}

}
