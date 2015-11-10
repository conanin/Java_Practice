package com.alf.socket;

import java.io.IOException;
import java.net.*;
import java.io.*;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 10, 2015 9:21:16 AM 
*/
public class TestUDPServer {
	public static void main( String[] args )
	{
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket( buf, buf.length);
		DatagramSocket ds = null;
		//Try to transfer byte array to int type.
		ByteArrayInputStream bais = null;
		DataInputStream dis = null;
		int output = 0;
		
		try 
		{
			ds = new DatagramSocket( 18888 );
		} 
		catch (SocketException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ds.receive(dp);
			bais = new ByteArrayInputStream( buf );
			dis = new DataInputStream( bais );
			output = dis.readInt();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println( output );
	}
}
