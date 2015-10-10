package com.alf.designPattern.DecoratorPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 30, 2015 9:12:18 AM 
*/
public class StarbuzzCoffee {
	public static void main( String[] args )
	{
		Beverage espresso = new Espresso();
		System.out.println( espresso.getDescription() + "\t$:" + espresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Soy(darkRoast);		
		System.out.println( darkRoast.getDescription() + "\t$:" + darkRoast.cost());
	}

}
