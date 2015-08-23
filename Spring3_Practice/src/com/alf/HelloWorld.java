/**
 * 
 */
package com.alf;

/**
 * @author yinga
 *
 */
public class HelloWorld {
	private String message;
	
	public void setMessage( String message )
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void printMessage()
	{
		System.out.println( "The message is:\t" + this.message );
	}
}
