package com.alf.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 1, 2015 5:21:57 PM 
*/
public class TransformIO_Example {
	static InputStreamReader isr = new InputStreamReader( System.in );
	static BufferedReader br = new BufferedReader( isr );
	
	public static void main( String[] args )
	{
		try {
			String input = br.readLine();	

			while ( input != null )
			{
				if( "exit".equals( input ) )
					System.exit(0);
				System.out.println( input.toLowerCase() );
				input = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
