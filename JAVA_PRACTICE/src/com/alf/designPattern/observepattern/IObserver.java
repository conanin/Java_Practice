package com.alf.designPattern.observepattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 3:36:37 PM 
*/
public interface IObserver {
	public void update(float temp,float humidity, float pressure);
}
