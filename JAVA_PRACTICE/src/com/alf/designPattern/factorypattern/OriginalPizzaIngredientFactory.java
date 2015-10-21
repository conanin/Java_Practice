package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 2:15:53 PM 
*/
public class OriginalPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new OriginalDough();
	}

	@Override
	public Cheese createCheese() {
		return new OriginalCheese();
	}

	@Override
	public Sause createSause() {
		return new OriginalSause();
	}

	@Override
	public Veggies[] createVeggies() {
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new OriginalPepperoni();
	}

	@Override
	public Clam createClam() {
		return new OriginalClam();
	}

}
