package com.alf.designPattern.adapter;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 22, 2015 2:39:55 PM 
*/
public class MallardDuck implements Duck
{

	@Override
	public void Fly() {
		System.out.println( this.getClass().getSimpleName() + " fly!");	
	}

	@Override
	public void Quack() {
		System.out.println( this.getClass().getSimpleName() + " quack!");
	}

	@Override
	public void swim() {
		System.out.println( this.getClass().getSimpleName() + " swim!");
	}

	@Override
	public void display() {
		System.out.println( this.getClass().getSimpleName() + " display!");
	}
}