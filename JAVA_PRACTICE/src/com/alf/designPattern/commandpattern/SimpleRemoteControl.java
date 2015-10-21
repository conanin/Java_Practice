package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:44:31 PM 
*/
public class SimpleRemoteControl {
	//Command slot;
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	int slotNo;
		
	public SimpleRemoteControl( int _slotNo)
	{
		this.slotNo = _slotNo;
		onCommands = new Command[slotNo];
		offCommands = new Command[slotNo];
		
		Command originalCommand = new NoCommand();
		
		for( int i = 0; i < slotNo; i ++ )
		{
			onCommands[i] = originalCommand;
			offCommands[i] = originalCommand;
		}
	}
	
	public void setCommand( int slotNo, Command onCommand, Command offCommand )
	{
		onCommands[slotNo] = onCommand;
		offCommands[slotNo] = offCommand;
	}
	
	public void onButtonWasPressed( int slotNo )
	{
		onCommands[slotNo].execute();
		undoCommand = onCommands[slotNo];
	}
	
	public void offButtonWasPressed( int slotNo )
	{
		offCommands[slotNo].execute();
		undoCommand = offCommands[slotNo];
	}
	
	public void undo()
	{
		undoCommand.undo();
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\n------ Remote Control ------\n");
		for( int i = 0; i < slotNo; i ++ )
		{
			sb.append("[slot" + i + "] " + onCommands[i].getClass().getSimpleName() + 
					"\t" + offCommands[i].getClass().getSimpleName() + "\n");
		}
		return sb.toString();
	}
}
