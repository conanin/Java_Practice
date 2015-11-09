package com.alf.socket;

import java.io.*;
import java.net.*;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 6, 2015 9:22:20 AM 
*/
public class TestTCPServer {
	public static void main( String[] args )
	{
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		PrintWriter pw = null;
		BufferedReader cbr = null;
		BufferedReader sbr = null;
		String line = null;
		try 
		{
			ss = new ServerSocket( 18888 );
			System.out.println(  "Waiting client send message..." );
			socket = ss.accept();
			System.out.println(  "A client is connected." );
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream( is );
			dos = new DataOutputStream( os );
			pw = new PrintWriter( os );
			cbr = new BufferedReader( new InputStreamReader( System.in));
			sbr = new BufferedReader( new InputStreamReader( is ));
			System.out.println( "Client Message:\t" + sbr.readLine() );
			line = cbr.readLine();
			
			while( !line.equals("bye") )
			{
				pw.println( line );
				pw.flush();
				System.out.println( "Server Message:\t" + line );
				System.out.println( "Client Message:\t" + sbr.readLine() );
				line = cbr.readLine();
			}
			
			/*
			System.out.println( dis.readUTF() );
			System.out.println( "Server Message: IP of client:\t" + socket.getInetAddress() );		
			dos.writeUTF( "From Server: Hello, Client! " );	
			*/
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				dis.close();
				dos.close();
				is.close();
				os.close();
				ss.close();
				socket.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
