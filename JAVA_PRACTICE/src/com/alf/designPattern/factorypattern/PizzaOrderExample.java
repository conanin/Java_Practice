package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 12, 2015 3:40:21 PM 
*/
public class PizzaOrderExample {
	public static void main(String[] args)
	{
		NYPizzaStore newYorkStore = new NYPizzaStore();
		newYorkStore.orderPizza( "cheese" );
		System.out.println( "Ethan ordered a " + newYorkStore.pizza.getClass().getSimpleName());
	}
}
