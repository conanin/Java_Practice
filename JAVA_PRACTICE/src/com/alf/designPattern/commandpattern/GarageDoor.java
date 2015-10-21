package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:59:44 PM 
*/
public class GarageDoor {
	
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void doorOpen() {
		System.out.println( location + " garage Door is opened.");
	}

	public void doorClose() {
		System.out.println(location + " garage Door is closed.");
	}

	public void stop() {
		System.out.println(location + " garage Door is Stopped");
	}

	public void lightOn() {
		System.out.println(location + " garage light is on");
	}

	public void lightOff() {
		System.out.println(location + " garage light is off");
	}

}
