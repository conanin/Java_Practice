package com.alf.sortalgorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 25, 2015 3:23:28 PM 
*/
public class InsertionSortTest {

	//	sorting process
	//	Around one:
	//		i = 1; 
	//		insertElement: arr[1] = 7
	//			j = 0;	arr[j] = 5	break;
	//		arr[1] = 7
	//
	//		Around two:
	//		i = 2;
	//		insertElement: arr[i] = 3			5 7 3 6
	//			j = 1; arr[j] = 7	arr[j+1]=7	5 7 7 6
	//			j = 0; arr[j] = 5       arr[j+1]=5	5 5 7 6
	//			j = -1;			arr[j+1]=3	3 5 7 6
	//
	//		Around three:
	//		i = 3;
	//		insertElement: arr[i] = 6
	//			j = 2; arr[j] = 7 	arr[j+1]=7	3 5 7 7
	//			j = 1; 			break		3 5 6 7
	@Test
	public void testDirectInsertionSort() {
		int[] arr = new int[]{5,7,3,6};
		InsertionSort.DirectInsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testbinaryInsertSort()
	{
		int[] arr = new int[]{5,7,3,6,2};
		InsertionSort.binaryInsertSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void testShellSort()
	{
		int[] arr = new int[]{5,7,3,6,2};
		InsertionSort.shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
