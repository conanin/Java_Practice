package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 3:40:37 PM 
*/
public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand( Light _light )
	{
		this.light = _light;
	}
	
	@Override
	public void execute() {
		light.on();	
	}

	@Override
	public void undo() {
		light.off();
	}
}
