package com.alf.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.*;

import javax.swing.JFrame;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Nov 12, 2015 9:54:18 AM 
*/
public class TestFrameForMouseEvent extends JFrame {

	private static final long serialVersionUID = 8396936788274851105L;
	
	ArrayList<Point> points = null;
	
	public static void main( String[] args )
	{
		 new TestFrameForMouseEvent() ;
	}
	
	public TestFrameForMouseEvent()
	{
		super( "Mouse Event" );
		points = new ArrayList<Point>();
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout( null );
		setBounds(600, 300, 400, 300);
		setBackground( Color.darkGray );
		setResizable(true);
		setVisible( true );
		addMouseListener( new Monitor() );
	}
	
	public void addPoint( Point p )
	{
		points.add( p );
	}
	
	public void paint( Graphics g )
	{
		Iterator<Point> i = points.iterator();
		while( i.hasNext() )
		{
			Point p = ( Point )i.next();
			g.setColor( Color.GREEN );
			g.fillOval(p.x, p.y, 10, 10);
		}
	}

	private class Monitor extends MouseAdapter
	{
		@Override
		public void mousePressed(MouseEvent e)
		{
			JFrame frame = (JFrame)e.getSource();
			addPoint( new Point( e.getX(), e.getY()) );
			frame.repaint();
		}
	}
}
