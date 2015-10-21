package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 11:00:29 AM 
*/
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Cheese createCheese();
	public Sause createSause();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
}
