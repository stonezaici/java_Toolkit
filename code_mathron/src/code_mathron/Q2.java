package code_mathron;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			String reqCode = null;
			String time = null;
			Date stime = null;
			Date etime = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			HashMap<String,Request> reqMap = new HashMap<String,Request>();
			while(line != null){
				line = line.toLowerCase();
				//System.out.println(line);
				if (line.contains("request [")){
					//System.out.println(line);
					// use Regex
					String regEx = "request \\[.{3}[0-9]{9}\\]";
					Pattern pat = Pattern.compile(regEx);
					Matcher mat= pat.matcher(line);
					mat.find();
					//System.out.println(mat.find());//fan hui shi fou zhao dao 
					//System.out.println(mat.group());// fan hui pi pei dao de zi fu chuan
					//System.out.println((mat.group()).substring(9, (mat.group()).length()-1));
					reqCode = (mat.group()).substring(9, (mat.group()).length()-1);
					time = line.substring(1, 24);
					if(reqMap.containsKey(reqCode)){
						if(line.contains("created")||line.contains("cancelled")||line.contains("rejected")){
							etime = sdf.parse(time);
							//System.out.println("this is end of time: " + etime);
							reqMap.get(reqCode).seteTime(etime);
						}
					}
					else{
						Request req = new Request();
						req.setId(reqCode);
						
						if(line.contains("sent")){
							stime = sdf.parse(time);
							System.out.println("this is start of time: " + stime);
							req.setsTime(stime);
						}
						reqMap.put(reqCode, req);
					}
				}
				line = br.readLine();
			}
			br.close();
			
			//对map进行遍历   以及进行时间差计算
			Request temp = new Request();
			Iterator keys = reqMap.keySet().iterator();
			Calendar startCal = Calendar.getInstance();
			Calendar endCal = Calendar.getInstance();
			
			
			while(keys.hasNext()){
				String key = (String) keys.next();//key
				temp = reqMap.get(key);
				if ((temp.geteTime() != null) ||(temp.getsTime() != null)){
					System.out.println(temp.getId());
					startCal.setTime(temp.getsTime());
					endCal.setTime(temp.geteTime());
					
					System.out.println("kai shi hao miao: " + startCal.getTimeInMillis());
					System.out.println("kai shi hao miao: " + endCal.getTimeInMillis());
					long dura = endCal.getTimeInMillis() - startCal.getTimeInMillis();
					System.out.println("shi jian cha: " + dura);
				}
				if((temp.geteTime() == null) ||(temp.getsTime() == null)){
					System.out.println("time is null");
				}
				else{
					System.out.println(key + "::" + sdf.format(temp.getsTime()) + "===>" + sdf.format(temp.geteTime()));
				}
				
			}
			reqMap.clear();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
