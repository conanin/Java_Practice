/**
 * 
 */
package com.alf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinga
 *
 */
public class MainApp {

	/**
	 * @param args
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		obj.printMessage();
	}
	 */

}
