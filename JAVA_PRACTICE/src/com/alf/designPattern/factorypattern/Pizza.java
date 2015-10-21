package com.alf.designPattern.factorypattern;

import java.util.ArrayList;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 10, 2015 5:27:49 PM 
*/
public abstract class Pizza {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//String dough;
	Dough dough;
	//String sause;
	Sause sause;
	//ArrayList<String> toppings = new ArrayList<String>();
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	
	public abstract void prepare();
	
	/*
	public void prepare()
	{
		System.out.println( "****** " + this.getClass().getSimpleName() + " ******");
		System.out.println( "Preparing " + name );
		System.out.println( "Tossing dough..." );
		System.out.println( "Add sause..." );
		for( int i = 0; i < toppings.size(); i ++ )
		{
			System.out.println( "** " + toppings.get(i) + " **" );
		}
	}
	*/

	public void bake()
	{
		System.out.println( "Bake for 25 minutes." );
	}

	public void split()
	{
		System.out.println( "Cutting the pizza into diagonal slices." );
	}

	public void box()
	{
		System.out.println( "Put the pizza into offical PizzaStore box.");
	}
	
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + ":\t" + name;
	}

}
