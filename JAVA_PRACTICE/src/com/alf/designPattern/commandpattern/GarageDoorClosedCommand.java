package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 2:27:59 PM 
*/
public class GarageDoorClosedCommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorClosedCommand( GarageDoor _garageDoor )
	{
		this.garageDoor = _garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.doorClose();
	}

	@Override
	public void undo() {	
		garageDoor.doorOpen();
	}
}
