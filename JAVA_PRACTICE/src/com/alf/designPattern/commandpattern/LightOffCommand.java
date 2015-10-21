package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 2:19:55 PM 
*/
public class LightOffCommand implements Command{

	Light light;
	
	public LightOffCommand( Light _light )
	{
		this.light = _light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
