package com.alf.thread;

import java.util.Date;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date�� Nov 4, 2015 9:20:50 AM 
* ͬ����һ��ԭ����Ӧ�þ�����Сͬ���������Ե�����õ�����. ������������ԼӴ���������
* Java���ԵĹؼ��֣�������������һ����������һ��������ʱ���ܹ���֤��ͬһʱ�����ֻ��һ���߳�ִ�иöδ��롣
* һ�������������̷߳���ͬһ������object�е����synchronized(this)ͬ�������ʱ��һ��ʱ����ֻ����һ���̵߳õ�ִ�С���һ���̱߳���ȴ���ǰ�߳�ִ�������������Ժ����ִ�иô���顣
* ����Ȼ������һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ����һ���߳���Ȼ���Է��ʸ�object�еķ�synchronized(this)ͬ������顣
* ��������ؼ����ǣ���һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�������̶߳�object����������synchronized(this)ͬ�������ķ��ʽ���������
* �ġ�����������ͬ����������ͬ������顣Ҳ����˵����һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�����ͻ�������object�Ķ�����������������̶߳Ը�object��������ͬ�����벿�ֵķ��ʶ�����ʱ������
* �塢���Ϲ��������������ͬ������.
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
