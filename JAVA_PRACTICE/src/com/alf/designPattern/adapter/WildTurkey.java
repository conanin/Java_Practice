package com.alf.designPattern.adapter;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 22, 2015 2:37:38 PM 
*/
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println( this.getClass().getSimpleName() + " gobble!");
	}

	@Override
	public void fly() {
		System.out.println( this.getClass().getSimpleName() + " fly a short distance!");	
	}

}