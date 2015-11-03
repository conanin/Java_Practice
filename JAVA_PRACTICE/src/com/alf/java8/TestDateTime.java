package com.alf.java8;

import org.junit.Test;
import java.time.*;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 3, 2015 2:48:45 PM 
*/
public class TestDateTime {
	@Test
	public void testLocalDate()
	{
		LocalDate ld = LocalDate.now();
		System.out.println( ld );
		int year = ld.getYear();
		Month month = ld.getMonth();
		int day = ld.getDayOfMonth();
		System.out.printf( "Today is %s\t %s, \t %s", year, month, day );
		
		LocalDate birthday = LocalDate.of(1979, 11, 15);
		System.out.println( "\n" + birthday );
	}

}
