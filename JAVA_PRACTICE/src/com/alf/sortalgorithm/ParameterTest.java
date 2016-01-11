package com.alf.sortalgorithm;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 5, 2016 2:27:34 PM 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith( Parameterized.class)
public class ParameterTest {
	int[] expected = {2,3,5,6,7};
	int[] input = {};
	
	@Parameters
	public static Collection<Object[]> getParams()
	{
		return Arrays.asList( new Object[][]
				{
					{Arrays.asList(2,3,5,6,7).toArray(),Arrays.asList(5,7,3,6,2).toArray()},
					{Arrays.asList(2,3,5,6,7).toArray(),Arrays.asList(3,7,5,6,2).toArray()}
				});
	}
	
	public ParameterTest( int[] expected, int[] input )
	{
		this.expected = expected;
		this.input = input;
	}
	
	@Test
	public void testSwapSort()
	{
		assertEquals( expected, SwapSort.quick_sort(input, 0, input.length -1 ));
	}
	
	

}
