/**
 * 
 */
package com.alf.str;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author yinga
 *
 */
public class testBasicString {

	
	@Test
	@Ignore
	public void testT1(){
		String a = "a" + "b" + 1;
		String b = "ab1";
		System.out.println("a Hash Code: " + a.hashCode() + "\n");
		System.out.println("b Hash Code: " + b.hashCode() + "\n");
		System.out.println( a == b);
		assertTrue("pass", a == b);
		//assertFalse("fail, it is impossible ><", a == b );
	}
	
	private static String getA(){ return "A";}	
	
	@Test
	public void testT2(){
		String a = "a";
		a.intern();
		final String c = "a";
		
		String b = a + "b";
		String d = c + "b";
		String f = getA() + "b";
		String compare = "ab";
		
		System.out.println( b == compare );
		System.out.println( f == compare );
		System.out.println( d == compare );
	}
	
	@Test
	public void testT3(){
		String a = "a";		
		String b = a + "b";
		String c = "ab";
		String e = "ab";
		String d = new String(b);
		
		System.out.println( b == c );
		System.out.println( c == d );
		System.out.println( c == d.intern());
		System.out.println( c.intern() == d.intern() );
		System.out.println( e == d.intern());
		System.out.println( e.intern() == d.intern());
	}
	
	@Test
	public void testDate()
	{
		Date date = new Date();
		SimpleDateFormat SDF = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss a z", Locale.US);
		System.out.println( SDF.format(date));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String a = "null";
		System.out.println(sb.append(a));
		System.out.println(sb.capacity());
		//java.lang.reflect.Modifier mod = new Modifierгигйг╗
		System.out.println("ParseInt = " + Integer.parseInt("10",16));
		System.out.println("ValueOf = " + Integer.valueOf("8",16));
	}

}

