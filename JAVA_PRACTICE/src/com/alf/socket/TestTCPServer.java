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
		//DataInputStream consoledis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		PrintWriter pw = null;
		BufferedReader cbr = null;
		BufferedReader sbr = null;
		String readline = "";
		try 
		{
			ss = new ServerSocket( 18888 );
			System.out.println(  "Waiting client send message..." );
			socket = ss.accept();
			socket = new Socket( "127.0.0.1", 18888);
			System.out.println( "Try to connect to server." );
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream( is );
			dos = new DataOutputStream( os );
			dos.writeUTF( "Hello, Server" );
			pw = new PrintWriter( os );
			cbr = new BufferedReader( new InputStreamReader( System.in));
			sbr = new BufferedReader( new InputStreamReader( is ));
			readline = cbr.readLine();
			
			while( readline != null )
			{
				System.out.println( socket.getLocalAddress() );
				System.out.println( "Client message:\t" + readline );
			}
			dos.writeUTF( "Hello, Client! " );
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
