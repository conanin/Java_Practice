package com.alf.designPattern.templatepattern;

import java.awt.Graphics;

import javax.swing.JFrame;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date�� Nov 4, 2015 3:27:20 PM 
*/
public class MyFrame extends JFrame {

	public MyFrame( String title )
	{
		super( title );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize( 300, 300 );
		this.setVisible( true );
	}
	
	public void paint( Graphics graphics )
	{
		super.paint( graphics );
		String message = "Hello World!";
		graphics.drawString(message, 100, 100);
	}
	
	public static void main( String[] args )
	{
		MyFrame myFrame = new MyFrame( "Head First Design Pattern" );
	}
}
