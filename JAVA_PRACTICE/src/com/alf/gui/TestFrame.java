package com.alf.gui;

import java.awt.*;

import javax.swing.JFrame;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 10, 2015 10:17:05 AM 
*/
public class TestFrame {
	static TextField num1 = null;
	static TextField num2 = null;
	static TextField result = null;
	
	public static void main( String[] args )
	{
		( new TestFrame() ).launchFrame();
	}
	
	public void launchFrame()
	{
		JFrame frame = new JFrame( "First Desktop App" );
		frame.setLayout( new GridLayout( 1,5) );
		frame.setBounds(600, 300, 400, 300);
		frame.setBackground( Color.darkGray );
		frame.setResizable(true);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		num1 = new TextField();
		Label plusLabel = new Label(" + ");
		num2 = new TextField();
		Button equelBtn = new Button(" = ");
		equelBtn.addActionListener( new Monitor( this ) );
		result = new TextField();
		
		frame.add(num1);
		frame.add(plusLabel);
		frame.add(num2);
		frame.add(equelBtn);
		frame.add(result);
		frame.pack();
		
		/*
		Button btn01 = new Button( "Click Me" );
		btn01.setActionCommand( "Action Command for Button" );
		Monitor monitor01 = new Monitor();
		btn01.addActionListener( monitor01 );
		
		frame.add(btn01);
		*/
		frame.setVisible( true );	
	}
}
