package com.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class DateConversion {

	
	
	 public static java.sql.Date stringToDate(String strDate) {

	        String methodName = "stringToDate";
	        java.sql.Date returnDate = new java.sql.Date(System.currentTimeMillis());
	        try {
	            Locale defaultLocale = Locale.getDefault();
	            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, defaultLocale);
	            java.util.Date d = df.parse(strDate);
	            returnDate = new java.sql.Date(d.getTime());
	           
	        } catch (ParseException pe) {
	           System.out.println("Exception from " + methodName + " is " + pe.getMessage());
	        }
	        return returnDate;

	    }
	 
	 
	 public static void main(String args[]) {
		 
		 String effectiveDate = "08/03/2014";
		 String expiryDate = "08/03/2015";
		 System.out.println("Effective Date : "+ DateConversion.stringToDate(effectiveDate));
		 System.out.println("Expiry Date : "+ DateConversion.stringToDate(expiryDate));
	
	 }
	 
}
