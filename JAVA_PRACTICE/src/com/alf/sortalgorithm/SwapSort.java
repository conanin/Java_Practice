package com.alf.sortalgorithm;

import java.util.Arrays;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 4, 2016 2:43:25 PM 
*/
public class SwapSort {
	
	/**
	 * 属于稳定性排序， 如果数据已有部分排好序， 则使用冒泡法可以很快完成排序。
	 * 缺点：效率低下，因为反复比较相邻两个元素。
	 * time complexity: O( N ) --  O(N * N) 
	 * space complexity: O(1)
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 3:20:16 PM Jan 4, 2016 2016
	 * @param: 
	 * @return: int[]
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param arr
	 * @return
	 */
	public static int[] BubbleSort( int[] arr)
	{
		int temp = 0;
		int length = arr.length;
				
		for( int i = length; i > 1 ; i -- )
		{
			boolean isChange = false;
			
			for( int j = 0 ; j < i - 1; j ++ )
			{
				if( arr[j+1] < arr[j] )
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isChange = true;
				}
			}
			
			if( isChange )
			{
				System.out.println( Arrays.toString( arr ));
			}
			
		}
		
		return arr;
	}
	
	//冒泡排序1
	int[] BubbleSort1(int a[], int n)
	{
	       int i, j;
	       for (i = 0; i < n; i++)
	              for (j = 1; j < n - i; j++)
	                     if (a[j - 1] > a[j])
	                            Swap(a[j - 1], a[j]);
	       
	       return a;
	}

	public void Swap( int i, int j )
	{
		int temp = i;
		i = j;
		j = temp;
	}
	
	static int[] quicksort(int arr[], int left, int right) {

        int dp;

        if (left < right) {

            dp = partition(arr, left, right);

            quicksort(arr, left, dp - 1);

            quicksort(arr, dp + 1, right);

        }
                
        return arr;

    }
	
	static int partition(int n[], int left, int right) {

        int pivot = n[left];

        while (left < right) {

            while (left < right && n[right] >= pivot)

                right--;

            if (left < right)

                n[left++] = n[right];

            while (left < right && n[left] <= pivot)

                left++;

            if (left < right)

                n[right--] = n[left];

        }

        n[left] = pivot;

        return left;

    }

	
	//快速排序
	public static int[] quick_sort( int[] arr, int left, int right )
	{
	    if ( left < right )
	    {
			//Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
	        int i = left;
			int j = right;
			int x = arr[left];
	        while (i < j)
	        {
	            while(i < j && arr[j] >= x) // 从右向左找第一个小于x的数
					j--;  
	            if(i < j) 
					arr[i++] = arr[j];
				
	            while(i < j && arr[i] < x) // 从左向右找第一个大于等于x的数
					i++;  
	            if(i < j) 
					arr[j--] = arr[i];
	        }
	        arr[i] = x;
	        quick_sort(arr, left, i - 1); // 递归调用 
	        quick_sort(arr, i + 1, right);
	    }
	    
	    return arr;
	}
}
