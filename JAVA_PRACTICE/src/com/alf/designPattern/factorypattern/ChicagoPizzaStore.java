package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 3:30:19 PM 
*/
public class ChicagoPizzaStore extends GeneralPizzaStore{
	PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
	
	@Override
	public Pizza createPizza(String type) {
		if( "cheese".equals( type ))
		{
			pizza = new ChicageStyleCheesePizza(factory);
		}
		if( "pep".equals( type ))
		{
			pizza = new ChicagoStylePepperoniPizza();
		}
		else
		{
			pizza = new OriginalPizza(factory);
		}
		
		return pizza;
	}

}
