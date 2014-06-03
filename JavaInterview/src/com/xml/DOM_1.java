package com.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class DOM_1 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		try{
			File f = new File("xml.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);
			NodeList nl = doc.getElementsByTagName("VALUE");
			for(int i = 0; i < nl.getLength(); i++){
				System.out.println("���ƺ��룺" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
				System.out.println("������ַ��" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
			}
		long lasting = System.currentTimeMillis() - start;
		System.out.println("����ʱ�䣺" + lasting);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
