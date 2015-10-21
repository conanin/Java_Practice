package com.alf.arraypratice;

import org.junit.Test;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 14, 2015 2:35:28 PM 
*/
public class ArrayTest01 {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 2:35:28 PM Oct 14, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
//		if( args.length < 5 )
//		{
//			System.out.println( "Usage: only accept less than five integer as parameters." );
//			System.exit(0);
//		}
//		else
//		{
//			for( int i = 0 ; i < args.length; i ++ )
//			{
//				System.out.println( args[i] + "\t" );
//			}
//		}
		
		int[] temp = new int[args.length];
		
		//transform string type array to Integer type array.
		for( int i = 0; i < args.length; i ++ )
		{
			temp[i] = Integer.parseInt(args[i]);
		}
		//ArrayTest01.printArray(temp);
		
		int[] tryArr = {1,4,5,3,2,6};
		
		// int[] result  = ArrayTest01.bubbleSort(temp);
		ArrayTest01.printArray(tryArr);
		//int[] result  = ArrayTest01.classicSelectSort(tryArr);
		//int[] result = ArrayTest01.advancedSelectSort(tryArr);
		ArrayTest01.bubbleSort(tryArr);
		ArrayTest01.printArray(tryArr);
		

	}
	
	private static int[] classicSelectSort( int[] arr )
	{
		int temp = 0;
		int nElem = arr.length;

		//sort the array.
		for( int i = 0 ; i < nElem - 1; i ++ )
		{
			for( int j = i + 1; j < nElem; j ++ )
			{
				if( arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	private static int[] advancedSelectSort( int[] arr )
	{
		int temp = 0;
		int nElem = arr.length;
		int tempPosition = 0;
		
		//sort the array.
		for( int i = 0 ; i < nElem - 1; i ++ )
		{
			tempPosition = i;
			
			for( int j = tempPosition + 1; j < nElem; j ++ )
			{
				if( arr[tempPosition] > arr[j])
				{
					tempPosition = j;
				}
			}
			
			if( tempPosition != i )
			{
				temp = arr[i];
				arr[i] = arr[tempPosition];
				arr[tempPosition] = temp;
			}
		}
		
		return arr;
	}
	
	//Move the biggest item to the end of array after every iteration.
	//Space Complexity: 1
	//Time Complexity : n * n   or n(at best)
	private static void bubbleSort(int[] arrs) 
	{
		int len = arrs.length;
		int date = 0;
		for( int i = len - 1; i >= 1; i -- )
		{
			for ( int j = 0; j <= i-1; j ++ )
			{
				if ( arrs[j] > (arrs[j + 1]) )
				{
					date = arrs[j];
					arrs[j] = arrs[ j + 1 ];
					arrs[j+1] = date;
				}
			}
		}
	}
	
	private static void printArray( int[] arr )
	{
		for( int i = 0; i < arr.length; i ++ )
		{
			System.out.print( i + ": " + arr[i] +"\t");
		}
	}
	
	@Test
	public void testArrayCopy()
	{
		int[] srcArr = { 1, 3, 5, 7, 11 };
		int[] desArr = new int[6];
		System.out.println("The original desArr is below before copy from srcArr:\n");
		ArrayTest01.printArray(desArr);
		System.arraycopy(srcArr, 0, desArr, 1, srcArr.length);
		System.out.println("\nThe desArr is below after copy from srcArr:\n");
		ArrayTest01.printArray(desArr);
		
		for( int i = 0; i < srcArr.length; i ++ )
		{
			srcArr[i] = 3 * i + 1;
		}
		
		System.out.println("\nThe srcArr is below :\n");
		ArrayTest01.printArray(srcArr);
		System.out.println("\nThe desArr is below :\n");
		ArrayTest01.printArray(desArr);
		
	}
}
