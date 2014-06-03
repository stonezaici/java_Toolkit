package com.scope;

import java.util.Scanner;

public class Cin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = null;
		String line2 = null;
//		line = sc.next();
//		System.out.println(line);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		while(sc.hasNext()){
			line = sc.next();
			System.out.println("line:" + line);
			line2 = sc.next();
			System.out.println("line2:" + line2);
		}
		
	}
	
	
}
