package com.alf.designPattern.Factory;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 10, 2015 5:23:17 PM 
*/
public abstract class GeneralPizzaStore {
	protected Pizza pizza;
	  
	public abstract Pizza createPizza( String type );
	
	public final void orderPizza( String type )
	{
		pizza = createPizza( type );
		pizza.prepare();
		pizza.bake();
		pizza.split();
		pizza.box();	
	}
}
