package com.stonezaici;

public class quickSort {

	/**
	 * @param args
	 */
	public int data[];
	public int partition (int sortArray[], int low, int hight){
		int key = sortArray[low];
		while(low < hight){//判断是否到中间了
			while(low < hight && sortArray[hight] >= key)//将比中心记录小的移到低端
				hight--;
				sortArray[low] = sortArray[hight];
			while(low < hight && sortArray[low] <= key)//将比中心记录大的移到高端
				low++;
			sortArray[hight] = sortArray[low];
		}
		sortArray[low] = key;//中心移到正确位置为止   说白了就是找出原来数组中第一个元素的最终位置  并返回  此时low = hight
		return low;
	}
	public void sort(int low,int hight){
		if(low < hight){//确定拆分点  并对数组元素进行移动
			int result = partition(data,low,hight);
			sort(low,result-1);//对左半段进行排序
			sort(result+1,hight);//对右半段进行排序
		}
	}
	public void outPut(){
		for(int i =0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
