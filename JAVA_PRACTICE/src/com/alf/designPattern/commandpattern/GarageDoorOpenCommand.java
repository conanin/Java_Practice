package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:57:56 PM 
*/
public class GarageDoorOpenCommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand( GarageDoor _garageDoor )
	{
		this.garageDoor = _garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.doorOpen();
	}

	@Override
	public void undo() 
	{
		garageDoor.doorClose();
	}

}
