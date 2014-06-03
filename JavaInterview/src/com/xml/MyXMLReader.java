package com.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyXMLReader extends DefaultHandler {
	java.util.Stack tags = new java.util.Stack();    

	public MyXMLReader() { //���캯��   

	super();    

	}
	public static void main(String args[]) {      

		long lasting = System.currentTimeMillis();      

		try {      

		SAXParserFactory sf = SAXParserFactory.newInstance();     

		SAXParser sp = sf.newSAXParser();      

		MyXMLReader reader = new MyXMLReader();      

		sp.parse(new InputSource("xml.xml"), reader);      

		} catch (Exception e) {      

		e.printStackTrace();    

		  }      

		System.out.println("����ʱ�䣺" + (System.currentTimeMillis() - lasting) + "����");}    

		 public void characters(char ch[], int start, int length) throws SAXException {    

		  String tag = (String) tags.peek();    

		  if (tag.equals("NO")) {    

		  System.out.print("���ƺ��룺" + new String(ch, start, length));    

		  }    

		  if (tag.equals("ADDR")) {      

		System.out.println("��ַ:" + new String(ch, start, length));    

		  }    

		  }    

		  public void startElement(String uri,String localName,String qName,Attributes attrs) {    

		  tags.push(qName);
		  
		  } 
}
