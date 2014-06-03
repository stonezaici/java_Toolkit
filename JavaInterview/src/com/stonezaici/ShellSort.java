package com.stonezaici;

public class ShellSort {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,74,65,56,47,38,29,10,9,8,7,6,5,4,3,2,1,0};
	int temp = -1;
	void ShellSortArray() 
	{ 
		  for(int incr=3;incr>0;incr--)//增量递减，以增量3，2，1为例 
		{ 
			  for(int L=0;L<incr;L++)//重复分成的每个子列表 
			{ 
				   for(int i=L;i<a.length;i+=incr)//对每个子列表应用冒泡排序 
				   { 
					   for(int j = L; j <i ; j += incr){
						   if (a[j]>a[i]){
							   temp = a[i];
							   a[i] = a[j];
							   a[j] = temp;
						   }
					   }
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
