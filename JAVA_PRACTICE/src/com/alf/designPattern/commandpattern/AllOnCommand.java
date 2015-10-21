package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 4:12:20 PM 
*/
public class AllOnCommand implements Command
{
	Light bedroomLight = new Light("bedroom");
	
	Light livingroomLight = new Light("livingroom");
	
	CeilingFan ceilingFan = new CeilingFan("toilet");
	
	LightOnCommand bedroomLightOnCommand = new LightOnCommand(bedroomLight);
	LightOffCommand bedroomLightOffCommand = new LightOffCommand(bedroomLight);
	
	LightOnCommand livingroomLightOnCommand = new LightOnCommand(livingroomLight);
	LightOffCommand livingroomLightOffCommand = new LightOffCommand( livingroomLight );
	
	CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
	
	Command[] onCommands = {bedroomLightOnCommand,ceilingFanMediumCommand, livingroomLightOnCommand};
	Command[] offCommands = {bedroomLightOffCommand, livingroomLightOffCommand};
	
	MacroCommand macroOn = new MacroCommand(onCommands);
	MacroCommand macroOff = new MacroCommand(offCommands);
	
	
	@Override
	public void execute() {
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
