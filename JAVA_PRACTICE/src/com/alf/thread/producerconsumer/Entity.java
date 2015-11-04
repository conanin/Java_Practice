package com.alf.thread.producerconsumer;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 4, 2015 2:11:10 PM 
*/
public class Entity {
	public int id ;
	
	public Entity( int _id )
	{
		this.id = _id;
	}
	
	public String toString()
	{
		return "Entity " + id; 
	}

}
