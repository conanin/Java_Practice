package com.alf.thread.producerconsumer;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 4, 2015 2:07:21 PM 
*/
public class Producer implements Runnable
{
	private int proNo = 10;
	
	public BasketStack basketStack;
	
	public Producer( BasketStack _basketStack )
	{
		this.basketStack = _basketStack;
	}

	@Override
	public void run() 
	{
		for( int i = 0; i < proNo; i ++ )
		{
			Entity entity = new Entity( i );
			basketStack.push( entity );
			System.out.println( this.getClass().getSimpleName() + ":\t " + i );
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
