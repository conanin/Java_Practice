package com.alf.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 1, 2015 5:52:20 PM 
*/
public class DataInputOutputStream_Example {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 5:52:20 PM Nov 1, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		 ByteArrayInputStream bais = null;
		 
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 DataOutputStream dos = new DataOutputStream( baos );
		 DataInputStream dis = null;
		 
		 try {
			System.out.println( "Before " + dos.size() );
			dos.writeDouble( Math.random() );
			dos.writeBoolean( true );
			System.out.println( "After " + dos.size() + "\n" );
			bais = new ByteArrayInputStream( baos.toByteArray() );
			dis = new DataInputStream( bais );
			System.out.println( dis.readDouble() );
			System.out.println( dis.readBoolean());
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
				bais.close();
				dos.flush();
				dos.close();
				baos.flush();
				baos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
