package com.alf.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 11, 2015 10:23:14 AM 
*/
public class Monitor implements ActionListener {

	TestFrame tf = null;
	
	public Monitor( TestFrame testFrame )
	{
		this.tf = testFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println( "Hello, Welcome GUI World!" );
		System.out.println( e.getActionCommand() );
		int num1 = Integer.parseInt( tf.num1.getText() );
		int num2 = Integer.parseInt( tf.num2.getText() );
		tf.result.setText( String.valueOf( num1 + num2 ));
	}
}
