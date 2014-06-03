package com.scope;

import java.util.HashMap;
import java.util.Map;

public class sum {

	public static int count = 0;
	public static void main(String[] args){
		int[] a = {1,2,3,4,24,16,32,8,36,60,78,39};
		int num = countNum(a);
		System.out.println(num);
	}
	public static int countNum(int[] a){
//		int index1 = 0;
//		int index2 = a.length-1;
//		for
//		while(index2>index1){
//			if(a[index1]+a)
//		}
		int p = 0;
		Map map = new HashMap();
		for(int i = 0; i < a.length; i++){
			map.put(a[i], a[i]);
		}
		for(int i = 0; i <a.length; i++){
			p = 40 - a[i];
			if(map.get(p) != null){
				count++;
			}
		}
		return count/2;
	}
}
