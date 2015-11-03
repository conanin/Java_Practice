package com.alf.designPattern.templatepattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 30, 2015 1:53:25 PM 
*/
public class TestTemplate {
	public static void main( String[] args )
	{
		BlackTea bt = new BlackTea();
		System.out.println( "Starting to make tea..." );
		bt.prepareRecipe();
	}
}
