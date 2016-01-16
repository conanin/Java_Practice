package com.alf.thread.concurrent.base;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 12, 2016 10:13:44 AM 
*/
public class ArmyRunnable implements Runnable {
	
		//可见性： refer to JMM happens-before rule
		volatile boolean keepRunning = true;

		@Override
		public void run() {
			while(keepRunning){
				//发动5连击。
				for(int i=0;i<5;i++){
					System.out.println(Thread.currentThread().getName()+" attack ["+i+"]");
					//让出处理器时间，不确定下次谁攻击。
					Thread.yield();
				}			
			}
			
			//Here to clean up resource to end.
			System.out.println(Thread.currentThread().getName()+" end fighting!");

		}

}
