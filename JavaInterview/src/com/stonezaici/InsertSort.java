package com.stonezaici;

public class InsertSort {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,745,65,56,478,38,29,10,9,8,7,6,5,4,3,2,1,0};
	public void doInsertSort(){
		int temp = -1;
		int j = -1;
		for(int i = 1; i < a.length; i++){//从第二个元素开始，因为第一个元素已经算为已排好序列中的了
			temp = a[i];
			j = i-1;
			while(j>=0 && a[j] > temp){//要注意j的范围是 大于等于0
				a[j+1] = a[j];//j+1 就是 i  a[j+1]就是a[i]
				j--;//j减一 看前一个元素是否还是大于temp
			}
			a[j+1] = temp; //如果前一个元素小于temp，将temp放在a[j+1]的位置，此时的j+1和    j--之前的j是一样的
		}
	}
	
	public void outPut(){
		for(int i = 0; i < a.length; i++){
			
			System.out.println(a[i]);
		}
	}
}
