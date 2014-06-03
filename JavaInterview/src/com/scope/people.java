package com.scope;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class people {

	public static void main(String[] args){
		String[] a = {"张三","李四","王五","赵六","陈七","高八","朱九","石石","黎贺","张磊","李佳","王霞"};
		int[] b = {24,25,26,28,24,26,25,28,29,30,24,24};
		
			countPeople(a,b);	
	}
	public static void countPeople(String[] a , int[] b){
//		for(int i = 0; i < a.length; i++){
//			for(int j =0; j < i; j++){
//				if(b[i] < b[j]){
//					int tmp = b[i];
//					b[i] = b[j];
//					b[j] = tmp;
//					String str = a[i];
//					a[i] = a[j];
//					a[j] = str;
//				}
//			}
//		}
//		for(int i )
		Map map = new HashMap();
		Map map2 = new HashMap();
		for(int i = 0; i < a.length; i++){
//			map.put(b[i], a[i]);
//			System.out.println();
			if(map.get(b[i]) == null){
				map.put(b[i], a[i]);
			}
			if(map.get(b[i]) != null){
				String str = map.get(b[i]) +"/" + a[i];
				map.remove(b[i]);
				map.put(b[i], str);
			}
			
		}
		Set it = map.keySet();
		while(it.iterator().hasNext()){
			//System.out.println(map.get(it.iterator().next()));
			int num = ((String)map.get(it.iterator().next())).split("/").length;
			map2.put(it, num);
			
		}
//		for(int i = 0; i < map2.size();i++){
//			for(int j = i; j<map2.size();j++){
//				if()
//			}
//		}
		
		Set it2 =  map2.keySet();
		while(it2.iterator().hasNext()){
			System.out.println(it2 +"///" +map.get(it2.iterator().next()));
		}
	}
}
