package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 9:54:03 AM 
*/
public class CaliforniaPizzaStore extends GeneralPizzaStore{
	PizzaIngredientFactory factory;
	
	public CaliforniaPizzaStore( PizzaIngredientFactory _factory )
	{
		this.factory = _factory;
	}
	
	@Override
	public Pizza createPizza(String type) {
		if( "clam".equals(type) )
		{
			pizza = new CaliforniaStyleClamPizza( factory );
		}
		else if( "".equals(type) )
		{
			pizza = new CaliforniaStyleVeggiePizza( factory );
		}
		else
		{
			pizza = new OriginalPizza( factory );
		}
		
		return pizza;
	}

}
