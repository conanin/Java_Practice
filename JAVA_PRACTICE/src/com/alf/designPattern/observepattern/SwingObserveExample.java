package com.alf.designPattern.observepattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 24, 2015 9:45:29 AM 
*/
public class SwingObserveExample {
	JFrame frame;
	
	public static void main(String[] args)
	{
		SwingObserveExample swingObserveExample = new SwingObserveExample();
		swingObserveExample.go();
	}

	private void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
}

class AngelListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Do NOT do it, you might regret it!\t From Angel.");
	}
}

class DevilListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Just do it!\t From Devil.");
	}
}
