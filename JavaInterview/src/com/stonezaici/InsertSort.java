package com.stonezaici;

public class InsertSort {

	/**
	 * @param args
	 */
	int[] a = {101,92,83,745,65,56,478,38,29,10,9,8,7,6,5,4,3,2,1,0};
	public void doInsertSort(){
		int temp = -1;
		int j = -1;
		for(int i = 1; i < a.length; i++){//�ӵڶ���Ԫ�ؿ�ʼ����Ϊ��һ��Ԫ���Ѿ���Ϊ���ź������е���
			temp = a[i];
			j = i-1;
			while(j>=0 && a[j] > temp){//Ҫע��j�ķ�Χ�� ���ڵ���0
				a[j+1] = a[j];//j+1 ���� i  a[j+1]����a[i]
				j--;//j��һ ��ǰһ��Ԫ���Ƿ��Ǵ���temp
			}
			a[j+1] = temp; //���ǰһ��Ԫ��С��temp����temp����a[j+1]��λ�ã���ʱ��j+1��    j--֮ǰ��j��һ����
		}
	}
	
	public void outPut(){
		for(int i = 0; i < a.length; i++){
			
			System.out.println(a[i]);
		}
	}
}
