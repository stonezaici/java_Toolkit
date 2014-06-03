package com.scope;

public class ThreadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread1 t_1 = new Thread1();
//		Thread2 t_2 = new Thread2();
//		Thread3 t_3 = new Thread3();
//		Thread4 t_4 = new Thread4();
//		Thread t1 = new Thread(t_1);
//		Thread t2 = new Thread(t_2);
//		Thread t3 = new Thread(t_3);
//		Thread t4 = new Thread(t_4);
//		
//		
//		t1.start();
//		//t1.sleep(10);
//		t2.start();
//		//t2.sleep(10);
//		t3.start();
//		//t3.sleep(10);
//		t4.start();
//		//t4.sleep(10);
//		
		FirstThread ft = new FirstThread();
		Thread t = new Thread(ft);
		t.setName("我的名字是FirstThread");
	
		Thread.currentThread().setName("我的名字是main");
		System.out.println(Thread.currentThread().getName());
		
		t.start();
	}

}
