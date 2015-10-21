package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 10:10:20 AM 
*/
public class SimplePizzaFactory {
	public Pizza createPizza( String type )
	{
		Pizza pizza = null;
		
		if ( "cheese".equals(type) )
		{
			//pizza = new NYStyleCheesePizza();
		}
		else if ( "veggie".equals(type) )
		{
			//pizza = new NYStyleVeggiePizza();
		}
		else if( "pep".equals( type ))
		{
			pizza = new ChicagoStylePepperoniPizza();
		}
		else
		{
			//pizza = new OriginalPizza();
		}
		
		return pizza;
	}

}
