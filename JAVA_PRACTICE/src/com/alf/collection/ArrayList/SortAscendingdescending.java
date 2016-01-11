package com.alf.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date�� Dec 22, 2015 5:37:47 PM 
*/
public class SortAscendingdescending {
	private static ArrayList<String> arraylist;

	public SortAscendingdescending(ArrayList<String> arraylist) {
		this.arraylist = arraylist;
	}
	
	public ArrayList<String> ascendList( )
	{
		Collections.sort( arraylist );
		return arraylist;
	}
	
	public ArrayList<String> descendList( )
	{
		Collections.sort(arraylist,Collections.reverseOrder());
		return arraylist;
	}
}
