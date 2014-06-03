package com.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4J {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		try{
			File f = new File("xml.xml");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			Element foo;
			for(Iterator i = root.elementIterator("VALUE");i.hasNext();){
				foo = (Element) i.next();
				System.out.println("车牌号码：" + foo.elementText("NO"));
				System.out.println("车主地址：" + foo.elementText("ADDR"));
			}
			long lasting = System.currentTimeMillis() - start;
			System.out.println("持续时间：" + lasting);
		}catch(Exception e ){
			e.printStackTrace();
		}
		
	}
}
