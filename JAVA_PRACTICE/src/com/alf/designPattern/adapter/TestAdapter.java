package com.alf.designPattern.adapter;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 22, 2015 2:44:09 PM 
*/
public class TestAdapter {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 2:44:09 PM Oct 22, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter( turkey );
		turkeyAdapter.Fly();
		turkeyAdapter.Quack();
	}

}
