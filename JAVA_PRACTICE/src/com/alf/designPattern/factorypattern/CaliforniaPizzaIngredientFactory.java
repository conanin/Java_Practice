package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 14, 2015 10:08:02 AM 
*/
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new CaliforniaStyleDough();
	}

	@Override
	public Cheese createCheese() {
		return new CaliforniaStyleCheese();
	}

	@Override
	public Sause createSause() {
		return new CaliforniaStyleSause();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Tomoto(), new Mushroom()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new CaliforniaStylePepperoni();
	}

	@Override
	public Clam createClam() {
		return new CaliforniaStyleClam();
	}

}
