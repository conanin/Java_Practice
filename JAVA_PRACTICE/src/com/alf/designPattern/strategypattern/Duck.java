package com.alf.designPattern.strategypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 3:56:37 PM 
*/
public abstract class Duck {
	protected flyBehavior flybehavior;
	protected quackBehavior quackbehavior;
	
	public flyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(flyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public quackBehavior getQuackbehavior() {
		return quackbehavior;
	}

	public void setQuackbehavior(quackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}

	public Duck()
	{		
	}
	
	public void performFly()
	{
		flybehavior.fly();
	}
	
	public void performQuack()
	{
		quackbehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
}
