package com.alf.designPattern.strategypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:02:05 PM 
*/
public class FlyNoWay implements flyBehavior{
	@Override
	public void fly() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("I can NOT fly!");
	}	
}