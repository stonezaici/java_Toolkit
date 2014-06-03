package com.scope;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Thread4 implements Runnable {

private String[] file = {"A.txt","B.txt","C.txt","D.txt"};
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("==========================");
		File outfile =null;
		try {
			FileOutputStream fos = null;
			OutputStreamWriter osw = null;
			BufferedWriter bw = null;
			for(int i=12; i > 0; i--){
				//write into four files
				outfile = new File(file[i%4]);
				 fos = new FileOutputStream(outfile);
				 osw = new OutputStreamWriter(fos);
				 bw = new BufferedWriter(osw);
				bw.write("4");
				bw.newLine();
				bw.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
