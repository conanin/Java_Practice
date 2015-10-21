package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 11:05:13 AM 
*/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Sause createSause() {
		return new MaranaraSause();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClams();
	}

}
