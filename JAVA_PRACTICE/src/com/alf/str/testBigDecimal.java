/**
 * 
 */
package com.alf.str;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

/**
 * @author yinga
 *
 */
public class testBigDecimal {

	/**
	 * @param args
	 */
	private static String lPad( String now, int expectLength, char paddingChar )
	{
		if( now == null || now.length() >= expectLength )
		{
			return now;
		}
		
		StringBuilder sb = new StringBuilder(expectLength);
		
		for( int i = 0, paddingLength = expectLength - now.length(); i< paddingLength; i ++ )
		{
			sb.append(paddingChar);
		}
		
		return sb.append(now).toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bigDecimal = new BigDecimal("128");
		System.out.println( "Original Value is: " + bigDecimal);
		byte[] bytes = bigDecimal.toBigInteger().toByteArray();
		for( byte b: bytes)
		{
			String bitString = lPad(Integer.toBinaryString(b & 0xff), 8, '0');
			System.out.println(bitString);
		}
		
		BigInteger bigInteger = new BigInteger(bytes);
		System.out.println( "Converted Result is: " + bigInteger );
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
	}
	
}
