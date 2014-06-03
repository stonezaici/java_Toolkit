package com.scope;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestABC {

	public static void main(String[] args) throws Exception {
		String[] files = { "1.txt", "2.txt", "3.txt", "4.txt" };

		for (int i = 12; i > 0; i--) {
				Thread a = new Thread(new MyThread1(files[i%4]));
				a.start();
				//a.join();
				a.sleep(10);
				
				Thread b = new Thread(new MyThread2(files[(i+1)%4]));
				b.start();
				//b.join();
				b.sleep(10);
				
				Thread c = new Thread(new MyThread3(files[(i+2)%4]));
				c.start();
				//c.join();
				c.sleep(10);
				
				Thread d = new Thread(new MyThread4(files[(i+3)%4]));
				d.start();
				//d.join();
				d.sleep(10);
		}
	}

}

class MyThread1 implements Runnable {
	private String fileName;

	public MyThread1(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		// System.out.print(name);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					fileName), true));
			bw.write("1");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread2 implements Runnable {
	private String fileName;

	public MyThread2(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		// System.out.print(name);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					fileName), true));
			bw.write("2");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread3 implements Runnable {
	private String fileName;

	public MyThread3(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		// System.out.print(name);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					fileName), true));
			bw.write("3");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread4 implements Runnable {
	private String fileName;

	public MyThread4(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		// System.out.print(name);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					fileName), true));
			bw.write("4");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
