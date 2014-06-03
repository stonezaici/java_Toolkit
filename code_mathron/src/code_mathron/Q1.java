package code_mathron;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("test.txt");
		String code = null;
		int quantity = 0;
		HashMap<String,Integer> prodmap = new HashMap<String,Integer>();
		//Date date = new Date("2012-10-1");
		//if(date == new Date("2012-10-1")) System.out.println("dsafa");
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while(line != null){
					if(line.contains("quantity")){
						code = line.split("product")[1].split(",")[1].split(":")[1];
						quantity = Integer.valueOf(line.split("product")[1].split(",")[2].split(":")[1]);
						if(prodmap.containsKey(code)){
							quantity = prodmap.get(code) + quantity;
							prodmap.put(code, quantity);
						}
						else{
							prodmap.put(code, quantity);
						}
					}
					line = reader.readLine();
				
				
					
			}
			reader.close();
					
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		//对map排序并输出上一次的prodmap

		List<Map.Entry<String, Integer>> arrayList = new ArrayList<Map.Entry<String, Integer>>(prodmap.entrySet());
		Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>(){
			public int compare (Map.Entry<String, Integer>o1,Map.Entry<String, Integer>o2){
				if (o2.getValue() - o1.getValue()>0)
					return 1;
				else 
					return -1;
			}
		});
		
		for(int i = 0; i < arrayList.size(); i++){
			System.out.print(arrayList.get(i).getKey() + "," + arrayList.get(i).getValue());
		}
		//对map进行遍历 
//		Iterator keys = prodmap.keySet().iterator();
//		while(keys.hasNext()){
//			String key = (String) keys.next();//key
//			Integer value = prodmap.get(key);//上面key对应的value
//			
//			System.out.println(key + "::" + value);
//		}
		
	}

}
