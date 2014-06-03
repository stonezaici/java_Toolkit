package com.stonezaici;

public class Maopao {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,74,65,56,47,38,29,10,9,8,7,6,5,4,3,2,1,0};
	int temp  ;
	public void doMaoPao(){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < i; j++){
				if(a[i]<a[j]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	public void outPut(){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
