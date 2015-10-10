package com.alf.TestConstructor;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 8, 2015 1:40:45 PM 
* The class is used to test constructor.
* 1. 子类的构造函数一定会调用其显式基类的构造方法。
* 2. 子类可以在自己的构造方法中使用super(argument_list)调用基类的构造函数。
*   a. 使用this(argument_list)调用本类的其他的构造函数。
*   b. 如果调用super,必须写在子类构造方法的第一行。
* 3. 如果子类的构造函数没有显式调用基类的构造函数，系统默认调用基类无参数的构造方法。
* 4. 如果子类的构造函数没有显式调用基类的构造函数，并且基类没有无参数的构造函数，编译出错。
*/
public class TestConstructor {
	public static void main( String[] args )
	{
		superSuperClass ssc = new subClass();
		//superSuperClass ssc = new subClass( 300 );
	}
}
