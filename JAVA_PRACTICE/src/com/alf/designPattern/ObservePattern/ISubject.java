package com.alf.designPattern.ObservePattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 3:35:47 PM 
*/
public interface ISubject {
	public void registerObserver(IObserver iObserver);
	public void removeObserver(IObserver iObserver);
	public void notifyObservers();
}
