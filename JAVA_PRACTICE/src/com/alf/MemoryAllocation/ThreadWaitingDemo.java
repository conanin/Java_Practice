/**
 * 
 */
package com.alf.MemoryAllocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yinga
 *
 */
public class ThreadWaitingDemo {
	
	//Demo for thread dead loop.
	private static void createBusyThread()
	{
		Thread thread = new Thread( new Runnable(){
			@Override
			public void run()
			{
				while(true)
					;
			}
		}, "testBusyThread");
		thread.start();
	}
	
	//Demo for thread dead loop.
	private static void createLockThread( final Object lock)
	{
		Thread thread = new Thread( new Runnable(){
			@Override
			public void run()
			{
				try{
					lock.wait();
				}
				catch( Exception e)
				{
					e.printStackTrace();
				}
			}
		}, "testLockedThread");
		thread.start();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object obj = new Object();
		createLockThread( obj );
		
	}

}
