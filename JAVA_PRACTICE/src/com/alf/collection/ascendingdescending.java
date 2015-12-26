package com.alf.collection;

import java.util.ArrayList;
import java.util.Collections;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Dec 22, 2015 5:37:47 PM 
*/
public class ascendingdescending {
	private static ArrayList arraylist;

	public ascendingdescending(ArrayList arraylist) {
		super();
		this.arraylist = arraylist;
	}
	
	public ArrayList ascendList( )
	{
		Collections.sort(arraylist);
		return arraylist;
	}
	

}
