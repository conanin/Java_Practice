package com.alf.designPattern.adapter;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 22, 2015 3:49:23 PM 
*/
public class DuckAdapter implements Turkey {

	Duck duck;
	
	public DuckAdapter( Duck _duck )
	{
		this.duck = _duck;
	}
	
	@Override
	public void gobble() {
		System.out.println( this.getClass().getSimpleName() + "gobble!" );
	}

	@Override
	public void fly() {
		System.out.println( this.getClass().getSimpleName() + "fly!" );
	}
}