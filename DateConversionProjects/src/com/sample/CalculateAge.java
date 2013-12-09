package com.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateAge {
	
	
	
	public static void main(String args[]) {
		
		CalculateAge ageCalc = new CalculateAge();
		
		Date futureDate = new Date(113, 12, 31);
		Date d14_11_2012 = new Date(112,10,16);
		Date today = new Date();
		
		System.out.println(" Calculated Age for 12/31/2013    "+ageCalc.calculateAge(futureDate));
		System.out.println(" Calculated Age for 11/14/2012    "+ageCalc.calculateAge(d14_11_2012));
		System.out.println(" Calculated age Today             "+ageCalc.calculateAge(today));
		
	}

	public int calculateAge(Date dob){
		final StringBuffer methodName = new StringBuffer("calculateAge");
		//mLog.debug(mClassName+ " :: "+methodName+" :: Entered ");
		 int age = 0;
		Date currentDate = new Date();
		try{			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
			Date date1 = simpleDateFormat.parse(dob.toString());
			Date date2 = simpleDateFormat.parse(currentDate.toString());
			
			//System.out.println("date2.compareTo(date1) "+ date2.compareTo(date1));
			
			if(date2.compareTo(date1) == 0)
			{	
				age = 0;
				System.out.println(((int)((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24))));
			}
			else if(date2.compareTo(date1) < 0 )
			{
				age = -1;
				System.out.println(((int)((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24))));
			}else
				{
				System.out.println(((int)((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24))));
				age = ((int)((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24)))/365;
				}
		}catch(Exception exception){
			System.out.println("Exception in "+" :: "+methodName+" :: "+exception.getMessage());
		}
		//mLog.debug(mClassName+ " :: "+methodName+" :: Exited ");
		return age;
	}

}
