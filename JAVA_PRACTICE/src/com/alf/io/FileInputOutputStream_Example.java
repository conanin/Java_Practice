package com.alf.io;

import java.io.*;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 29, 2015 10:56:24 AM 
*/
public class FileInputOutputStream_Example {
	static FileInputStream in = null;
	static FileOutputStream out = null;
	static int c = 0;
	static int countNo = 0;
	
	public static void main( String[] args )
	{
		
		synchronized( FileInputOutputStream_Example.class)
		{
			System.out.println(System.getProperty("user.dir"));
			
			try 
			{
				in = new FileInputStream("ByteUtils.class");
				out = new FileOutputStream("output.txt");

			} catch (FileNotFoundException e) {
				System.out.println( "The file is not found." );
				e.printStackTrace();
			}
			try 
			{
				while ( (c = in.read()) != -1 )
				{
					out.write(c);
					countNo ++;
				}
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					in.close();
					out.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		String srcMd5 = FileUtils.getFileMD5(new File("ByteUtils.class"));
		System.out.println( srcMd5 );
		
		String desMd5 = FileUtils.getFileMD5(new File("output.txt"));
		System.out.println( desMd5 );
		
		if( srcMd5.equals(desMd5)  )
		{
			System.out.println( " The source and destination are the same. " );
			System.out.println( " The count of total character is " + countNo );
			System.out.println( " The channel of input is " + in.getChannel() );
			System.out.println( " The channel of output is " + out.getChannel() );
		}
	}
}