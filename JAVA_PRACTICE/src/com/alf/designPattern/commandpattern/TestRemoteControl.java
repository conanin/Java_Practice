package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:48:20 PM 
*/
public class TestRemoteControl {
	public static void main( String[] args )
	{
		
		SimpleRemoteControl src = new SimpleRemoteControl(4);
		System.out.println(src.toString());
		
		NoCommand noCommand = new NoCommand();
		/*
		Light light = new Light( "kitchen" );
		LightOnCommand kitchenLightOnCommand = new LightOnCommand( light );
		LightOffCommand kitchenLightOffCommand = new LightOffCommand( light );
		src.setCommand( 0, kitchenLightOnCommand, kitchenLightOffCommand );
		src.onButtonWasPressed(0);
		src.offButtonWasPressed(0);
		
		GarageDoor garageDoor = new GarageDoor("backyard");
		GarageDoorOpenCommand backyardGarageDoorOpenCommand = new GarageDoorOpenCommand( garageDoor );
		GarageDoorClosedCommand backyardGarageDoorClosedCommand = new GarageDoorClosedCommand( garageDoor );
		src.setCommand(1, backyardGarageDoorOpenCommand, backyardGarageDoorClosedCommand );
		src.onButtonWasPressed(1);
		src.offButtonWasPressed(1);
		
		System.out.println(src.toString());
		
		CeilingFan ceilingFan = new CeilingFan( "bedroom" );
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand( ceilingFan );
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand( ceilingFan );
		src.setCommand(2, ceilingFanMediumCommand, noCommand);
		src.setCommand(3, ceilingFanHighCommand, noCommand);
		System.out.println(src.toString());
		src.onButtonWasPressed(2);
		src.undo();
		src.onButtonWasPressed(3);
		src.undo();
		*/
		
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
		
		src.setCommand(0, macroOn, macroOff);
		
		System.out.println(src.toString());
		System.out.println( " -- Pushing Macro On --");
		src.onButtonWasPressed(0);
		System.out.println( " -- Pushing Macro Off --");
		src.offButtonWasPressed(0);
	}
}
