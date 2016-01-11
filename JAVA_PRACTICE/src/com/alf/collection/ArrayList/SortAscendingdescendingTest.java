package com.alf.collection.ArrayList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 29, 2015 10:26:18 AM 
*/
public class SortAscendingdescendingTest {
	
	SortAscendingdescending unsortAscendingdescending = null;
	ArrayList<String> countries = new ArrayList<String>();

	/**
	 * Test method for {@link com.alf.collection.ArrayList.SortAscendingdescending#ascendList()}.
	 */
	@Before
	public void initArrayList()
	{
		//Initial ArrayList with String
		countries.add( "France" );
		countries.add( "India" );
		countries.add( "England" );
		countries.add( "China" );
		countries.add( "US" );	
		System.out.println( "Unsorted ArrayList: ");
		for( Iterator<String> it = countries.iterator(); it.hasNext(); )
		{
			System.out.print( it.next() + "\t");
		}
		
		unsortAscendingdescending = new SortAscendingdescending( countries );
	}
	
	@Test
	public void testAscendList() {
		unsortAscendingdescending.ascendList();
		System.out.println( "\nSorted Ascend ArrayList: ");
		for( Iterator<String> it = countries.iterator(); it.hasNext(); )
		{
			System.out.print( it.next() + "\t" );
		}
	}

	/**
	 * Test method for {@link com.alf.collection.ArrayList.SortAscendingdescending#descendList()}.
	 */
	@Test
	public void testDescendList() {
		unsortAscendingdescending.descendList();
		System.out.println( "\nSorted Descend ArrayList: ");
		for( Iterator<String> it = countries.iterator(); it.hasNext(); )
		{
			System.out.print( it.next() + "\t" );
		}
	}

}
