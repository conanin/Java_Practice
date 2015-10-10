package com.alf.designPattern.StrategyPattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:00:14 PM 
*/
public class FlyWithWings implements flyBehavior{
	@Override
	public void fly() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("I am flying!!");
	}
}
