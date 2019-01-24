package com.psl.util;

import java.sql.Timestamp;
import java.util.Date;

public class DateOperations {

	public static void main(String[] args) {
		Date d1 =new Date();
		
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		Date date=new Date(ts.getTime());
		
		System.out.println("date1="+d1+"\ndate2= "+date);
		
		if(d1.compareTo(date)==0){
			System.out.println("both dates are same "+String.format("%s", date));
		}
		else{
			System.out.println("both dates are different :\n"+String.format("%s", date)+" and\n"+String.format("%s", d1));
		}
	}
}
