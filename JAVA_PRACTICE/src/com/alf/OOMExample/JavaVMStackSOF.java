/**
 * 
 */
package com.alf.OOMExample;

/**
 * @author yinga
 *
 */
public class JavaVMStackSOF {
	
	private int stackLength = 1;
	
	private void stackLeak()
	{
		stackLength += 1;
		stackLeak();
	}
	
	public static void main( String[] args )
	{
		JavaVMStackSOF jof = new JavaVMStackSOF();
		try{
			jof.stackLeak();
		}
		catch(Throwable e)
		{
			System.out.println( "Stack Length is: " + jof.stackLength );
			System.out.println( e);
		}
		
	}

}
