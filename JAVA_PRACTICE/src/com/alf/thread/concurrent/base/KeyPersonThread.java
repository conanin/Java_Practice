package com.alf.thread.concurrent.base;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 12, 2016 10:47:18 AM 
*/

public class KeyPersonThread extends Thread {

	public void run(){
		System.out.println(Thread.currentThread().getName()+" Start fighting.");
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" fighting with army...");
		}
		System.out.println(Thread.currentThread().getName()+" End fighting.");
	}
}

