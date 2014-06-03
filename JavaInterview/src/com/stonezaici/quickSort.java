package com.stonezaici;

public class quickSort {

	/**
	 * @param args
	 */
	public int data[];
	public int partition (int sortArray[], int low, int hight){
		int key = sortArray[low];
		while(low < hight){//�ж��Ƿ��м���
			while(low < hight && sortArray[hight] >= key)//�������ļ�¼С���Ƶ��Ͷ�
				hight--;
				sortArray[low] = sortArray[hight];
			while(low < hight && sortArray[low] <= key)//�������ļ�¼����Ƶ��߶�
				low++;
			sortArray[hight] = sortArray[low];
		}
		sortArray[low] = key;//�����Ƶ���ȷλ��Ϊֹ   ˵���˾����ҳ�ԭ�������е�һ��Ԫ�ص�����λ��  ������  ��ʱlow = hight
		return low;
	}
	public void sort(int low,int hight){
		if(low < hight){//ȷ����ֵ�  ��������Ԫ�ؽ����ƶ�
			int result = partition(data,low,hight);
			sort(low,result-1);//�����ν�������
			sort(result+1,hight);//���Ұ�ν�������
		}
	}
	public void outPut(){
		for(int i =0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
