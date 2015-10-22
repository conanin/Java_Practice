package com.alf.designPattern.adapter;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 22, 2015 2:41:22 PM 
*/
public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter( Turkey _turkey )
	{
		this.turkey = _turkey;
	}

	@Override
	public void Fly() {
		System.out.println( this.getClass().getSimpleName());
		turkey.fly();
	}

	@Override
	public void Quack() {
		System.out.println( this.getClass().getSimpleName());
		turkey.gobble();
	}

	@Override
	public void swim() {
	}

	@Override
	public void display() {	
	}
}