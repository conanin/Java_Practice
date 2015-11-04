package com.alf.thread.producerconsumer;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 4, 2015 2:14:13 PM 
*/
public class BasketStack {
	public Entity[] entities = new Entity[5];
	
	int index = 0;
	
	public synchronized void push( Entity _entity )
	{
		while( entities.length == index )
		{
			try 
			{
				this.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		this.notify();
		
		entities[ index ] = _entity;
		index ++;
	}

	public synchronized Entity pop()
	{
		while( 0 == index )
		{
			try 
			{
				this.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		this.notify();
		index --;
		return entities[ index ];
		
	}
}
