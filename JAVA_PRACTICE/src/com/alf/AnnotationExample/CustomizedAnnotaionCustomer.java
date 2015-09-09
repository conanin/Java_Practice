package com.alf.AnnotationExample;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 9, 2015 7:58:48 AM 
*/
@CustomizedAnnotation(desc="first class customer", author = "conanin")
public class CustomizedAnnotaionCustomer {
	public static int gcOldAge = 0;
	
	public void SetGcOldAge( int gcOldAge )
	{
		this.gcOldAge = gcOldAge;
	}
	
	public int GetGcOldAge()
	{
		return this.gcOldAge;
	}
	
	@CustomizedAnnotation(desc="first method customer", author = "YinGang", version=1.1)
	public static void printGcOldAge()
	{
		System.out.println( "gcOldAge is:\t" + gcOldAge );
	}
}
