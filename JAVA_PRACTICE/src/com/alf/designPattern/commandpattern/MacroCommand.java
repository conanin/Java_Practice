package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 4:06:03 PM 
*/
public class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand( Command[] _commands )
	{
		this.commands = _commands;
	}

	@Override
	public void execute() {
		for( int i = 0 ; i < commands.length; i ++ )
		{
			commands[i].execute();
		}
		
	}

	@Override
	public void undo() {
		for( int i = commands.length - 1; i >= 0; i -- )
		{
			commands[i].undo();
		}	
	}
}
