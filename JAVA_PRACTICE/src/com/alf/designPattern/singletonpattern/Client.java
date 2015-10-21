package com.alf.designPattern.singletonpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 14, 2015 10:04:42 AM 
*/
public class Client {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 10:04:42 AM Oct 14, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		ClassicSingleton.getInstance().work();
	}

}
