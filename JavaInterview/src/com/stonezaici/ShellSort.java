package com.stonezaici;

public class ShellSort {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,74,65,56,47,38,29,10,9,8,7,6,5,4,3,2,1,0};
	int temp = -1;
	void ShellSortArray() 
	{ 
		  for(int incr=3;incr>0;incr--)//�����ݼ���������3��2��1Ϊ�� 
		{ 
			  for(int L=0;L<incr;L++)//�ظ��ֳɵ�ÿ�����б� 
			{ 
				   for(int i=L;i<a.length;i+=incr)//��ÿ�����б�Ӧ��ð������ 
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
