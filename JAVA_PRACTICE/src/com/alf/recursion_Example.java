package com.alf;

import java.io.File;

import org.junit.Test;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 23, 2015 9:35:19 AM 
*/
public class recursion_Example {
	@Test
	public void testListFiles()
	{
		File f = new File( "C:/Temp/A" );
		System.out.println( f.getName() );
		listFileTree( f, 0  );
	}
	
	
	public void listFileTree( File f, int level )
	{
		String prefix = "  " ;
		
		for( int i = 0; i < level; i++ )
		{
			prefix +=  "  ";
		}
		
		File[] childFiles = f.listFiles();
		for( int i = 0; i < childFiles.length; i ++ )
		{
			System.out.println( prefix + childFiles[i].getName());
			if( childFiles[i].isDirectory())
			{
				listFileTree( childFiles[i], level + 1);
			}
			
		}
		
		level ++;
	}

}
