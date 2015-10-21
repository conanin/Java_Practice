package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 3:23:34 PM 
*/
public class CeilingFanLowCommand implements Command{
	CeilingFan ceilingFan;
	int prevLevel;
	
	public CeilingFanLowCommand( CeilingFan _ceilingFan )
	{
		this.ceilingFan = _ceilingFan;
	}

	@Override
	public void execute() {
		prevLevel = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if( prevLevel == CeilingFan.LOW)
		{
			ceilingFan.low();
		}
		else if( prevLevel == CeilingFan.HIGH )
		{
			ceilingFan.high();
		}
		else if( prevLevel == CeilingFan.OFF)
		{
			ceilingFan.off();
		}
	}
	
	
	
	
}
