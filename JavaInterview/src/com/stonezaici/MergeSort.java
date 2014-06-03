package com.stonezaici;

import javax.xml.crypto.Data;

public class MergeSort {

	/**
	 * @param args
	 */
	
	
	public static void mergeSort(Comparable[] data,int min,int max){
		//Java.lang.Comparable接口中唯一的方法是compareTo（），在该方法中可以进行简单的相等比较以及执行顺序比较
		int mid = (min+max)/2;
		if(max > min){
			mergeSort(data,min,mid);//每次取min和mid之间的元素进行排序，并将排序后的元素 复制给原来处在min和mid之间的元素。
			mergeSort(data,mid+1,max);
			merge(data,min,mid,max);
		}
	}
	public static void merge(Comparable[] data, int min,int mid, int max){
		Comparable[] temp = new Comparable[max+1];
		//Comparable[] temp = new Comparable[max - min + 1]; 
		int begin1 = min;
		int begin2 = mid+1;
		int index = min;
		while(begin1 <= mid && begin2 <= max){
			//循环比较
			if(data[begin1].compareTo(data[begin2]) <0)
				temp[index++] = data[begin1++];
			else
				temp[index++] = data[begin2++];
		}
		if(begin1 > mid) /* 剩余部分一次放入中间数组 */
			for(int i = begin2; i <= max; i++)
				temp[index++] = data[i];
		if(begin2 > max)
			for(int i = begin1; i <=mid; i++)
				temp[index++] = data[i];
		for(int i = min; i <= max; i++) //将最后的结果赋予最开始拿数据的那一段数组即  介于min和max之间的那段
			data[i]=temp[i];
			
	}
	public static void outPut(Comparable[] data){
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
