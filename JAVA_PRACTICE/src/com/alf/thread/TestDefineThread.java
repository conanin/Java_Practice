package com.alf.thread;

import java.util.Date;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 3, 2015 9:42:48 AM 
* The class is used to show how to define and start thread.
*/
public class TestDefineThread {
	static int count = 0;
	
	public static void main( String[] args )
	{
		try 
		{
			for( int i = 0 ; i < 8; i ++ )
			{
				System.out.println( "Main Thread " + count + "\t" + Math.random() );
				count ++;
			}
			ThreadFromRunnable tfr = new ThreadFromRunnable();
			Thread runnableThread1 = new Thread( tfr );
			runnableThread1.start();
			runnableThread1.join();
			Thread threadFromThread1 = new ThreadFromThread();
			threadFromThread1.start();
			Thread.sleep(5000);
			//ThreadFromThread.flag = false;
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}
}

class ThreadFromRunnable implements Runnable
{
	@Override
	public void run() 
	{
		for( int i = 0; i <= 10; i ++ )
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println( this.getClass().getSimpleName() + i + "\t" + new Date() );
				if( i == 5 )
				{
					Thread.yield();
				}
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				return;
			}
		}
	}	
}

class ThreadFromThread extends Thread
{
	static boolean flag = true;
	int count = 0;
	
	@Override
	public void run() 
	{
		while( flag )
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println( this.getClass().getSimpleName() + count + "\t" + Math.random() );
				count ++;
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				return;
			}
		}
	}	
}
