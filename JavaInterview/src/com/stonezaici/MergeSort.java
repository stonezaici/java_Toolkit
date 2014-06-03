package com.stonezaici;

import javax.xml.crypto.Data;

public class MergeSort {

	/**
	 * @param args
	 */
	
	
	public static void mergeSort(Comparable[] data,int min,int max){
		//Java.lang.Comparable�ӿ���Ψһ�ķ�����compareTo�������ڸ÷����п��Խ��м򵥵���ȱȽ��Լ�ִ��˳��Ƚ�
		int mid = (min+max)/2;
		if(max > min){
			mergeSort(data,min,mid);//ÿ��ȡmin��mid֮���Ԫ�ؽ������򣬲���������Ԫ�� ���Ƹ�ԭ������min��mid֮���Ԫ�ء�
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
			//ѭ���Ƚ�
			if(data[begin1].compareTo(data[begin2]) <0)
				temp[index++] = data[begin1++];
			else
				temp[index++] = data[begin2++];
		}
		if(begin1 > mid) /* ʣ�ಿ��һ�η����м����� */
			for(int i = begin2; i <= max; i++)
				temp[index++] = data[i];
		if(begin2 > max)
			for(int i = begin1; i <=mid; i++)
				temp[index++] = data[i];
		for(int i = min; i <= max; i++) //�����Ľ�������ʼ�����ݵ���һ�����鼴  ����min��max֮����Ƕ�
			data[i]=temp[i];
			
	}
	public static void outPut(Comparable[] data){
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
