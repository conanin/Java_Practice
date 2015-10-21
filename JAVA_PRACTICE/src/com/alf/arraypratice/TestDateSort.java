package com.alf.arraypratice;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 1:57:44 PM 
*/
public class TestDateSort {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 1:57:44 PM Oct 15, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		ALFDate[] dates = {new ALFDate( 2006,5,4), new ALFDate( 2006,7,4 ), 
							new ALFDate( 2008,5,4 ), new ALFDate( 2004,5,9 ), 
								new ALFDate( 2004,5,4 )};
		
		//bubbleSort( dates );
		standardbubbleSort( dates );
		
		for( int i = 0; i < dates.length; i ++ )
		{
			ALFDate.printALFDate( dates[i] );
		}
	}

	private static void bubbleSort(ALFDate[] dates) {
		int len = dates.length;
		ALFDate date = null;
		for( int i = len - 1; i >= 1; i -- )
		{
			for ( int j = i - 1; j >= 0; j -- )
			{
				if ( dates[i].compare(dates[j]) == -1)
				{
					date = dates[j];
					dates[j] = dates[i];
					dates[i] = date;
				}
			}
		}
	}
	
	private static void standardbubbleSort(ALFDate[] dates) {
		int len = dates.length;
		ALFDate date = null;
		for( int i = len - 1; i >= 1; i -- )
		{
			for ( int j = 0; j <= i - 1; j ++ )
			{
				if ( dates[j].compare(dates[j+1]) == 1 )
				{
					date = dates[j];
					dates[j] = dates[i];
					dates[i] = date;
				}
			}
		}
	}
	
	

}
