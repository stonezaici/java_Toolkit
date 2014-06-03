package com.stonezaici;

public class Xuanze {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,74,65,56,47,38,29,10,9,8,7,6,5,4,3,2,1,0};
	public void doXuanZe(){
		
		int tmp = -1;
		for(int i = 0; i < a.length; i++){
		
			for(int j = i+1; j<a.length; j++){
				if(a[i] > a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	public void output(){
		for(int i = 0; i <a.length; i++){
			System.out.println(a[i]);
		}
	}
}
