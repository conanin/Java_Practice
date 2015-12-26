package com.alf.TestConstructor;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 25, 2015 2:21:03 PM 
*/
public class SuperClassTest {

	@Test
	//SuperSuperClass constructor is called implicitly.
	public void testSuperClass() {
		SuperClass father = new SuperClass();
		assertTrue(father.publicCount == 3);
		System.out.print( father.protectedCount );
		assertTrue(father.protectedCount == 1);
	}

	@Test
	public void testSuperClassInt() {
		//fail("Not yet implemented");
		for( int i = 0; i < 5; i ++ )
		{
			for( int j = 5; j > i; j -- )
			{
				System.out.print( "*" );
			}
			System.out.println("");
		}
	}

}
