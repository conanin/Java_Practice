package com.alf.designPattern.factorypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 13, 2015 11:14:38 AM 
*/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sause createSause() {
		return new PlumTomotoSause();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Tomoto()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new ChicagoStylePepperoni();
	}

	@Override
	public Clam createClam() {
		return new FrozenClams();
	}

}
