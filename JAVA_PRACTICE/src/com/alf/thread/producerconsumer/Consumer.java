package com.alf.thread.producerconsumer;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 4, 2015 2:07:11 PM 
*/
public class Consumer implements Runnable
{
	
	private int consNo = 10;
	public BasketStack basketStack;
	
	public Consumer( BasketStack _basketStack )
	{
		this.basketStack = _basketStack;
	}

	@Override
	public void run() 
	{
		for( int i = 0; i < consNo; i ++ )
		{
			basketStack.pop();
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
