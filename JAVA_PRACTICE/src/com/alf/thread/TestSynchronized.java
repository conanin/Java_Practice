package com.alf.thread;

import java.util.Date;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Nov 4, 2015 9:20:50 AM 
* 同步的一般原理是应该尽量减小同步的粒度以到达更好的性能. 如果死锁，可以加大锁的粒度
* Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。
* 一、当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，一个时间内只能有一个线程得到执行。另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
* 二、然而，当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
* 三、尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
* 四、第三个例子同样适用其它同步代码块。也就是说，当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。
* 五、以上规则对其它对象锁同样适用.
*/

public class TestSynchronized implements Runnable {
	static volatile int b  = 1000;
	
	public void m1()
	{	
		//synchronized( TestSynchronized.class )	synchronized for the entire class.
		synchronized( this )	// synchronized for instance of the class.
		{
			System.out.println( "m1: b = \t" + b );
//			System.out.println( "m1: " + ( new Date() ).toInstant());
			b = 2000;
			System.out.println( "m1: b = \t" + b );
//			System.out.println( "m1: " + ( new Date() ).toInstant());
			try 
			{
				Thread.sleep(5000);
				b = 3000;
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println( "m1: b = \t" + b );
//			System.out.println( "m1: " + ( new Date() ).toInstant());
		}
	}
	
	public void m2()
	{
		//synchronized( TestSynchronized.class )	synchronized for the entire class.
		synchronized( this )  // synchronized for instance of the class.
		{
//			System.out.println( "m2: " + ( new Date() ).toInstant() );
			System.out.println( "m2: b = \t" + b );
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			b = 4000;
			System.out.println( "m2: b = \t" + b );
//			System.out.println( "m2: " + ( new Date() ).toInstant() );
		}
	}

	@Override
	public void run() 
	{
		m1();	
	}
	
	public static void main( String[] args )
	{
		TestSynchronized  ts = new TestSynchronized();
		Thread thread = new Thread( ts );
		thread.start();
		ts.m2();
	}

}
