package com.alf.designPattern.singletonpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 14, 2015 9:54:44 AM 
*/
public class ClassicSingleton {
	
	private volatile static ClassicSingleton uniqueClassicSingleton;
	
	private ClassicSingleton()
	{
		
	}
	
	public static ClassicSingleton getInstance()
	{
		if( uniqueClassicSingleton == null )
		{
			synchronized( ClassicSingleton.class )
			{
				if( uniqueClassicSingleton == null )
				{
					uniqueClassicSingleton = new ClassicSingleton();
				}
			}
			
		}
		
		return uniqueClassicSingleton;
	}
	
	public void work()
	{
		System.out.println( uniqueClassicSingleton.getInstance().getClass().getName());
	}

}
