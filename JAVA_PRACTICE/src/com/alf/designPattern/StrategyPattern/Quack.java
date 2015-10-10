package com.alf.designPattern.StrategyPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:06:51 PM 
*/
public class Quack implements quackBehavior{
	@Override
	public void quack() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Quack!Quack!Quack!");
	}
}