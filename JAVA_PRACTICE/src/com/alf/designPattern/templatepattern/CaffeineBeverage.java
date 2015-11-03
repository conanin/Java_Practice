package com.alf.designPattern.templatepattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 30, 2015 1:39:37 PM 
*/
public abstract class CaffeineBeverage {
	
	//Standard template method, all beverages should share the same predecessor.
	final void prepareRecipe()
	{
		boilWater();
		brew();
		pureInCup();
		if ( customWantsCondiments() )
		{
			addCondiments();
		}
		
		hook();
	}

	//The method should not be implemented by sub class. It is assumed that the same between beverages.
	private void pureInCup() 
	{
		System.out.println( "General Step: Boil the water. " );
	}

	//The method should be implemented by sub class. It is different between beverages.
	public abstract void addCondiments();

	//The method should be implemented by sub class. It is different between beverages.
	public abstract void brew();

	//The method should not be implemented by sub class. It is assumed that the same between beverages
	private void boilWater() 
	{
		System.out.println( "General Step: Boil the water. " );		
	}
	
	//Hook method do nothing, sub class will decide if override it or not.
	void hook()
	{
		
	}
	
	//Hook method.
	boolean customWantsCondiments()
	{
		return true;
	}
}