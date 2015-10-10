package com.alf.designPattern.StrategyPattern;

import java.lang.reflect.Method;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 11, 2015 4:09:53 PM 
*/
public class MiniDuckSimulator {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 4:09:53 PM Sep 11, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Class cls = mallard.getClass();
		mallard.setFlybehavior( new FlyNoWay() );
		mallard.setQuackbehavior( new Squeak() );
		Method[] methods = mallard.getClass().getMethods();
		System.out.println();
		for( Method m: methods)
		{
			System.out.println( m.getModifiers() + " " + m.getReturnType() + " " + m.getName());
		}
		System.out.println("======================================");
		mallard.performFly();
		System.out.println("======================================");
		mallard.performQuack();
		System.out.println("======================================");
		mallard.swim();
		System.out.println("======================================");
		mallard.display();
	}

}
