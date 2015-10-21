package com.alf.designPattern.strategypattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:05:03 PM 
*/
public class MuteQuack implements quackBehavior{
	@Override
	public void quack() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("<< Silence >>");
	}	
}
