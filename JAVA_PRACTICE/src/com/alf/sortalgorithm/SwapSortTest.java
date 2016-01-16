package com.alf.sortalgorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import com.alf.sortalgorithm.SwapSort;
import org.hamcrest.*;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 4, 2016 2:47:49 PM 
*/
public class SwapSortTest {

	@Test
	public void testBubbleSort() {
		int[] arr = { 5,7,3,6,2 };
		int[] b = new SwapSort().BubbleSort1(arr,arr.length);
		//assertArrayEquals((2,3,5,6,7), new ExchangeSort().BubbleSort(arr));
		System.out.println( Arrays.toString( b ));
	}
	
	@Test
	public void testQuickSort()
	{
		int[] arr = { 5,7,3,6,2 };
		SwapSort.quick_sort(arr, 0, arr.length - 1);
		//assertArrayEquals((2,3,5,6,7), new ExchangeSort().BubbleSort(arr));
		System.out.println( Arrays.toString( arr ));
	}

}
