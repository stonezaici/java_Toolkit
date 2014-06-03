package com.xml;

import java.io.*;     

import java.util.*;     
   
import org.jdom.*;     
   
import org.jdom.input.*;

public class JDOM {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		try{
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(new File("xml.xml"));
			Element foo = doc.getRootElement();
			List allChildren = foo.getChildren();
			for(int i = 0; i < allChildren.size();i++){
				System.out.println("���ƺ��룺" + ((Element)allChildren.get(i)).getChild("NO").getText());
				System.out.println("������ַ��" + ((Element)allChildren.get(i)).getChild("ADDR").getText());
			}
			long lasting = System.currentTimeMillis() - start;
			System.out.println("����ʱ�䣺" + lasting);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
