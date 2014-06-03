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
				System.out.println("车牌号码：" + ((Element)allChildren.get(i)).getChild("NO").getText());
				System.out.println("车主地址：" + ((Element)allChildren.get(i)).getChild("ADDR").getText());
			}
			long lasting = System.currentTimeMillis() - start;
			System.out.println("持续时间：" + lasting);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
