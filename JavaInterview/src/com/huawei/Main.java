package com.huawei;

import java.util.Scanner;

public class Main {

	public static  int num=0 ;
	public static int[][] arr = null;
	public static void main(String[] args){
		int N,start,end;
	
		Scanner sc = new Scanner(System.in);
		
			N = sc.nextInt();
			arr = new int[N][N];
			start = sc.nextInt();
			end = sc.nextInt();
		for(int i = 0; i < N ; i++){
			for(int j = 0; j < N; j++){
				arr[i][j] = sc.nextInt();
				//System.out.println(arr[i][j] + "i:" + i + "j:" +j);
			}
		}
		int[] select = new int[N];
		 select[start] = 1;
		 find(start,end,select,N);
		System.out.println(num);
		
	}
	
	public static  int find(int start, int end, int select[],int N){
//		int[] select = new int[N];//初始化默认值为0
		if(start==end){
			return 1;
		}
		else{
				for(int k = 0; k < N;k++){
					 if(arr[start][k]==1 && select[k]!=1){
						select[k] = 1;
						if( find(k,end,select,N)==1) num++;//但若改为 num = num +  find(k,end,select,N)  num 就会又一次清零  然后最后的结尾会变为1
						select[k] = 0;
					}
				}
		
		return 0; 
		}
	}
}
