package com.alf.socket;

import java.net.*;
import java.io.*;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 10, 2015 9:26:32 AM 
*/
public class TestUDPClient {
	public static void main( String[] args )
	{
		int count = ( int )(Math.random() * 1000);
		System.out.println( "Count: " + count );
		//Try to transfer int type to byte array
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream( baos );
		try 
		{
			dos.writeInt(count);
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		byte[] buf = baos.toByteArray();
		//byte[] buf = ( new String( "Who are U")).getBytes();
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		dp = new DatagramPacket( buf, buf.length, new InetSocketAddress( "127.0.0.1", 18888 ) );
		try 
		{
			ds = new DatagramSocket( 19999 );
		} 
		catch (SocketException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ds.send(dp);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		ds.close();
	}
}
