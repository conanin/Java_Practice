package com.alf.thread;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Nov 4, 2015 9:01:58 AM 
* Dead Lock Thread Example.
* Solution: 增加锁的对象的粒度。
*/
public class TestDeadLock implements Runnable {

	int flag = 0;
	Object o1 = new Object();
	Object o2 = new Object();
	
	
	@Override
	public void run() {
		System.out.println( "flag:\t " + flag );
		if( flag == 1)
		{
			synchronized( o1 )
			{
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				synchronized( o2 )
				{
					System.out.println( "1" );
				}
			}
		}	
		if( flag == 0)
		{
			synchronized( o2 )
			{
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				synchronized( o1 )
				{
					System.out.println( "0" );
				}
			}
		}
	}
	
	public static void main( String[] args )
	{
		TestDeadLock tdl01= new TestDeadLock();
		TestDeadLock tdl02 = new TestDeadLock();
		tdl01.flag = 0;
		tdl02.flag = 1;
		Thread thread1 = new Thread( tdl01 );
		Thread thread2 = new Thread( tdl02 );
		thread1.start();
		thread2.start();
	}
}
