package com.alf.thread.producerconsumer;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 4, 2015 2:57:36 PM 
*/
public class TestStub 
{
	public static void main( String[] args )
	{
		BasketStack basketStack = new BasketStack();
		Producer producer = new Producer( basketStack );
		Consumer consumer = new Consumer( basketStack );
		Thread producerThread = new Thread( producer );
		Thread consumerThread = new Thread( consumer );
		producerThread.start();
		consumerThread.start();
	}
}
