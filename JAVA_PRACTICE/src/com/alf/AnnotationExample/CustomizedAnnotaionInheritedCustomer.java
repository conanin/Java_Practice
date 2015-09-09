package com.alf.AnnotationExample;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 9, 2015 8:48:13 AM 
*/
// @CustomizedAnnotation(desc="second class customer", author = "conanin son")
public class CustomizedAnnotaionInheritedCustomer extends CustomizedAnnotaionCustomer{
	public static int gcOldAge = 0;
	
	public void SetGcOldAge( int gcOldAge )
	{
		this.gcOldAge = gcOldAge;
	}
	
	public int GetGcOldAge()
	{
		return this.gcOldAge;
	}
	
//	@CustomizedAnnotation(desc="second method customer", author = "YinGang son", version=1.2)
	public static void printGcOldAge()
	{
		System.out.println( "gcOldAge is:\t" + gcOldAge );
	}

}
