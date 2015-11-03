package com.alf.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Oct 30, 2015 9:38:47 AM 
*/
public class BufferReaderWriter_Example {
	
	static BufferedWriter bw = null;
	static BufferedReader br = null;
	
	public static void main( String[] args )
	{
		String lineStr = "";
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		try {
			bw = new BufferedWriter( new FileWriter( "result.txt" ) );
			br = new BufferedReader( new FileReader( "test.txt" ) );
			while ( ( lineStr = br.readLine() ) != null )
			{
				bw.write( lineStr );
				bw.newLine();
				bw.write( "=======\t" + sdf.format( new Date() ) + "\t======");
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
