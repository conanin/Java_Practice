package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:41:51 PM 
*/
public class Light
{	
	String location;
	int level;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		System.out.println( location + "Light is on");
	}

	public void off() {
		level = 0;
		System.out.println( location + "Light is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println( location + "Light is dimmed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}
}
