package com.alf.designPattern.StrategyPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:08:14 PM 
*/
public class Squeak implements quackBehavior {
	@Override
	public void quack() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Squeak!Squeak!Squeak!");
	}

}
