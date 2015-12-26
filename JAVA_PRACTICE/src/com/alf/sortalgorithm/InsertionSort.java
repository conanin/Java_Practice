package com.alf.sortalgorithm;

import java.util.Arrays;

import oracle.sql.ARRAY;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 25, 2015 2:55:59 PM 
*/
public class InsertionSort {
	
	/**
	 * time complexity: O(N * N)
	 * Ascending order
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 3:07:18 PM Dec 25, 2015 2015
	 * @param: 
	 * @return: int[]
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param arr
	 * @return
	 */
	public static int[] DirectInsertionSort(int[] arr)
	{
		int i,j;
		int insertElement;	//The element need to be inserted.
		int[] array = arr;
	    
	    //从数组的第二个元素开始循环将数组中的元素插入
		for ( i = 1; i < array.length; i++ )
		{
		   //设置数组中的第2个元素为第一次循环要播讲的数据
			insertElement = array[i];
			j = i - 1;
			while( j >= 0 && array[j] > insertElement )   
			{
			    //如果要播讲的元素小于第j个元素,就将第j个元素向后移动
			    array[j+1]=array[j];
			    j--;
			}
			//直到要插入的元素不小于第j个元素,将insertNote插入到数组中
			array[j+1] = insertElement; 
		  }
		  System.out.println(Arrays.toString(array));
		  return array;
	 }
	
	/**
	 * 二分法插入排序：在一个有序表中进行查找和插入，用折半查找实现查找步骤
	 * time complexity: O(N * N) 
	 * space complexity: O(1)
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 3:38:33 PM Dec 25, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param arr
	 */
	public static void binaryInsertSort( int[] arr ) 
	{  
		for (int i = 0; i < arr.length; i++) 
		{
            int temp = arr[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            while( left <= right )
            {
                mid = ( left + right ) / 2;
                if( temp < arr[mid] )
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            for ( int j = i - 1; j >= left; j-- ) 
            {
                arr[j+1] = arr[j];
            }
            if( left != i )
            {
                arr[left] = temp;
            }
        }

		
		System.out.println( Arrays.toString(arr)) ;
	}

	public static int binarySearch(int[]a ,int num)
	{
		if ( a.length == 0 ) 
		{
			return -1;
		}
		
		int startPosition = 0;
		int endPosition = a.length - 1;
		int midPosition = (startPosition + endPosition) / 2;
		
		while (startPosition <= endPosition) 
		{
			if (a[midPosition] == num) {
				return midPosition;
			}
			if (a[midPosition] > num ) {
				endPosition = midPosition - 1;
			}
			if (a[midPosition] < num ) {
				startPosition = midPosition + 1 ;
			}
			midPosition = (startPosition + endPosition)/2;
		}
		
		return -1;
	}
}