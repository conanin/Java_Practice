package com.alf.AnnotationExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 9, 2015 8:03:47 AM 
*/
public class ParseAnnotation {

	/**
	 * @author: conanin
	 * @email: conanin@live.cn
	 * @version:
	 * @Time: 8:03:47 AM Sep 9, 2015 2015
	 * @param: 
	 * @return: void
	 * exception/@throws: 
	 * @see
	 * @since
	 * @serial/@serialField/@serialData: 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//1. Load class using class loader.
			CustomizedAnnotaionCustomer cac = new CustomizedAnnotaionCustomer();
			// Class cls = Class.forName("com.alf.AnnotationExample.CustomizedAnnotaionCustomer");
			Class cls = Class.forName("com.alf.AnnotationExample.CustomizedAnnotaionInheritedCustomer");
			//2. Find whether specific class annotatino exists on the class.
			boolean isAnnotatinExist = cls.isAnnotationPresent(CustomizedAnnotation.class);
			if( isAnnotatinExist )
			{
				//3. Get the class annotation if it exists.
				CustomizedAnnotation classann = (CustomizedAnnotation)cls.getAnnotation(CustomizedAnnotation.class);
				System.out.println("The method " + cls.getName() + " annotation details as below:\n");
				System.out.println( classann.author());
				System.out.println(classann.desc());
				System.out.println(classann.version());
				System.out.println("===========================================");
			}
			//4. Find whether specific method annotatino exists on the class.
			Method[] methods = cls.getDeclaredMethods();
			for( Method m: methods )
			{
				boolean isMethodAnnotatinExist = m.isAnnotationPresent(CustomizedAnnotation.class);
				if( isMethodAnnotatinExist )
				{
					CustomizedAnnotation methodann = (CustomizedAnnotation)m.getAnnotation(CustomizedAnnotation.class);
					System.out.println("The method " + m.getName() + " annotation details as below:\n");
					System.out.println(methodann.author());
					System.out.println(methodann.desc());
					System.out.println(methodann.version());
					m.invoke(cac);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
