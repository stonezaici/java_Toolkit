package com.stonezaici;

public class HeapSort {  
    public static int heap_size;  
    //˫�ױ��  
    public static int parent(int i){  
        return i/2;  
    }  
    //���ӱ��  
    public static int leftChild(int i){  
        return 2*i;  
    }  
    //�Һ��ӱ��  
    public static int rightChild(int i){  
        return 2*i + 1;  
    }  
    /** 
     * �������ѵ����� 
     * @param a�����е�����Ԫ�� 
     * @param i�����Ը�Ԫ��Ϊ��Ԫ�صĶѽ��е���������ǰ�᣺���������������� 
     *  
     * �������Һ��Ӷ������ѣ����ȱȽϸ�Ԫ�������Һ��ӣ��ҳ����ֵ�����粻�Ǹ�Ԫ�أ����������Ԫ�ص�ֵ�� 
     * �������ӣ��Һ��ӣ���ֵ���Ԫ�ؽ������п��ܴ����������������������������ʣ���˼������ã�ֱ��Ҷ��Ԫ�ء� 
     */  
    public static void max_heapify(int[] a, int i){  
        int left = leftChild(i);  
        int right = rightChild(i);  
        int largest = 0;  
        if(left < heap_size && a[i]<a[left]){  
            largest = left;  
        }else{  
            largest = i;  
        }  
        if(right < heap_size && a[right] > a[largest]){  
            largest = right;  
        }  
        if(largest == i){  
            return ;  
        }else{  
            int temp = a[i];  
            a[i] = a[largest];  
            a[largest] = temp;  
            max_heapify(a, largest);  
        }  
    }  
    /** 
     * �������ѡ��������У�a.length/2+1һֱ������Ԫ�ض���Ҷ��Ԫ�أ�Ҳ����ƽ�����ѣ���˴���ǰһ��Ԫ�ؿ�ʼ��һֱ�� 
     * ��һ��Ԫ�أ��ظ�����max_heapify������ʹ�䱣�����ѵ����� 
     * @param a 
     */  
    public static void build_max_heap(int[] a){  
        for(int i = a.length/2; i>=0; i--){  
            max_heapify(a, i);  
        }  
    }  
    /** 
     * ����������ʹ�ý������ѵ��㷨���������ѣ�Ȼ�󽫶Ѷ�Ԫ�أ����ֵ�������һ��ֵ������ͬʱʹ�� 
     *              �ѵĳ��ȼ�С1 �����ñ����������ʵ��㷨������ʹ�öѶ�Ԫ�س�Ϊ���ֵ����ʱ���һ��Ԫ���ѱ��ų����⡢ 
     */  
    public static void heapSort(int[] a){  
        build_max_heap(a); 
//        for(int i = 0; i< a.length; i++){  
//            System.out.print(a[i] + "  ");  
//        } 
        
        for(int i = a.length - 1; i>=0; i--){  
            int temp = a[0];  
            a[0] = a[i];  
            a[i] = temp;  
            heap_size--;  
            max_heapify(a, 0);  
        }  
    }  
    public static void main(String[] args) {  
        int a[] = {5, 4, 1, 3, 2, 16, 9, 10,14, 8, 7};  
        heap_size = a.length;  
        heapSort(a);  
        for(int i = 0; i< a.length; i++){  
            System.out.print(a[i] + "  ");  
        }  
    }  
}  