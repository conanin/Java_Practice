package com.alf.util.jdom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.InputSource;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date£º Dec 23, 2015 10:15:07 AM 
*/
public class JDOMParser {
	
	public static void main( String[] args ) 
	{
		SAXBuilder builder = new SAXBuilder();
		String xmlpath = "src\\com\\alf\\util\\jdom\\Book.xml";
		try {
			Document doc = builder.build(xmlpath );
			Element books = doc.getRootElement();
			List<Element> booklist = books.getChildren("book");
			for( Iterator<Element> it = booklist.iterator(); it.hasNext();)
			{
				Element book = (Element) it.next();
				String email=book.getAttributeValue("email");
				System.out.println( "email:\t" + email);
				String name=book.getChildTextTrim("name");
				System.out.println( "name:\t" + name);
				String price = book.getChildTextTrim("price");
				System.out.println( "Price:\t" + price );
				book.getChild("name").setText("Fringe");
			}
			
			XMLOutputter outputter = new XMLOutputter();
			outputter.output( doc,new FileOutputStream(xmlpath) );
		} 
		catch (JDOMException | IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
