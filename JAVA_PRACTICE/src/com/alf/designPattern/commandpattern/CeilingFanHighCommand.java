package com.alf.designPattern.commandpattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 19, 2015 3:23:34 PM 
*/
public class CeilingFanHighCommand implements Command{
	CeilingFan ceilingFan;
	int prevLevel;
	
	public CeilingFanHighCommand( CeilingFan _ceilingFan )
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
		if( prevLevel == CeilingFan.MEDIUM)
		{
			ceilingFan.medium();
		}
		else if( prevLevel == CeilingFan.LOW )
		{
			ceilingFan.low();
		}
		else if( prevLevel == CeilingFan.OFF)
		{
			ceilingFan.off();
		}
	}
	
	
	
	
}
