package com.alf.socket;

import java.net.*;
import java.io.*;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 6, 2015 9:22:07 AM 
*/
public class TestTCPClient {
	public static void main( String[] args ) 
	{
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		PrintWriter pw = null;
		BufferedReader cbr = null;
		BufferedReader sbr = null;
		String readline;
		
		try 
		{
			socket = new Socket( "127.0.0.1", 18888);
			System.out.println( "Try to connect to server." );
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream( is );
			dos = new DataOutputStream( os );
			pw = new PrintWriter( os );
			cbr = new BufferedReader( new InputStreamReader( System.in));
			sbr = new BufferedReader( new InputStreamReader( is ));
			readline = cbr.readLine();
			/*
			dos.writeUTF( "From Client: Hello, Server" );
			System.out.println( dis.readUTF() );
			*/
			while( !readline.equals("bye") )
			{
				pw.println( readline );
				pw.flush();
				System.out.println( "Client Message:\t" + readline );
				System.out.println( "Server Message:\t" + sbr.readLine());
				readline = cbr.readLine();
			}	
			
			if( readline.equals("bye"))
			{
				pw.println( readline );
				pw.println( "The client will be closed." );
				pw.flush();
				System.out.println( "Client Message:\t" + readline );
				socket.close();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{			
				is.close();
				dis.close();
				os.close();
				dos.close();
				pw.close();
				cbr.close();
				sbr.close();
				socket.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		}
	}

}
