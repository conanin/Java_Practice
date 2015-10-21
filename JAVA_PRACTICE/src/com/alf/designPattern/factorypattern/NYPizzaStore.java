package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 10, 2015 5:38:01 PM 
*/
public class NYPizzaStore extends GeneralPizzaStore{
	
	PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

	@Override
	public Pizza createPizza(String type) {
		if ( "cheese".equals(type) )
		{
			//pizza = new NYStyleCheesePizza( factory );
			pizza = new CheesePizza( factory );
		}
		else if ( "veggie".equals(type) )
		{
			pizza = new NYStyleVeggiePizza( factory );
		}
		else if ( "clam".equals(type) )
		{
			pizza = new ClamPizza( factory );
		}
		else
		{
			pizza = new OriginalPizza( factory );
		}
		return pizza;
	}

}
