/**
 * 
 */
package com.alf.OOMExample;

/**
 * @author yinga
 *
 */
public class JavaVMStackOOM {

	private void doNotStop()
	{
		while(true)
		{
			
		}
	}
	
	private void stackLeakByThread()
	{
		while(true)
		{
			Thread thread = new Thread( new Runnable(){
					@Override
					public void run()
					{
						doNotStop();
					}
			});
			thread.start();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
