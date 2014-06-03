package com.scope;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	
	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = "20071354";
		String yy = date.substring(0, 4);
		String MM = date.substring(4, 6);
		String dd = date.substring(6, 8);
//		boolean flag_y = false;
//		boolean flag_m = false;
		System.out.println(yy+MM+dd);
		boolean flag_d = false;
		ParsePosition pp = new ParsePosition(0);
		Date dt;
		if(Integer.parseInt(yy)%400==0||(Integer.parseInt(yy)%4==0&&Integer.parseInt(yy)%100!=0)){
			
			if((Integer.parseInt(MM)==2)&&(Integer.parseInt(dd)>0 && Integer.parseInt(dd)<30)){
				flag_d = true;
			}
			
		}
		else if((Integer.parseInt(MM)==2)&&(Integer.parseInt(dd)>0 && Integer.parseInt(dd)<29)){
				flag_d = true;
		}
		if((Integer.parseInt(MM)==4 || Integer.parseInt(MM)==6 || Integer.parseInt(MM)==9 || Integer.parseInt(MM)==11) && (Integer.parseInt(dd)>0 && Integer.parseInt(dd)<31)){
			flag_d = true;
		}
		if((Integer.parseInt(MM)==1 || Integer.parseInt(MM)==3 || Integer.parseInt(MM)==5 || Integer.parseInt(MM)==7 
				|| Integer.parseInt(MM)==8 || Integer.parseInt(MM)==10 || Integer.parseInt(MM)==12) && (Integer.parseInt(dd)>0 && Integer.parseInt(dd)<32)){
			flag_d = true;
		}
		
		if(flag_d == true){
			dt = sdf.parse(date,pp);
			if(dt != null){
				System.out.println(dt);
			}
		}
		else System.out.println("·Ç·¨ÊäÈë");
		
		
		
	}
	
}
