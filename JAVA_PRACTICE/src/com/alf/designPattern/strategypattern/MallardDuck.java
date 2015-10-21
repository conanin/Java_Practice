package com.alf.designPattern.strategypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:11:27 PM 
*/
public class MallardDuck extends Duck{
	public MallardDuck()
	{
		flybehavior = new FlyWithWings();
		quackbehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println(this.getClass().getName());
		System.out.println("I am a mallard duck");
	}
}
