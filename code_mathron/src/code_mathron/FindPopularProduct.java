package code_mathron;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPopularProduct {
	
	//public 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "c:\txt.txt";
//		String regEx = "txt";
//		Pattern pat = Pattern.compile(regEx);
//		Matcher mat= pat.matcher(str);
//		System.out.println(mat.find());
//		System.out.println(mat.group());
		/*for(int i = 0; i < mat.groupCount(); i++){
			System.out.println(mat.group(i));
		}*/
		File file = new File("test.txt");
		File out = new File("out.txt");
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(out));//�����ļ�
			//BufferedWriter writer = new BufferedWriter(new FileWriter(out,true));// ������д�ļ�
			String line = reader.readLine();
			while(line != null){
				System.out.println(line);
				//writer.
				writer.write(line);
				writer.newLine();
				
				line = reader.readLine();
			}
			writer.flush();
			reader.close();
			writer.close();
					
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		
	}

}
