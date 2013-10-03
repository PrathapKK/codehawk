package com.sample;

public class StringBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(100);
		StringBuffer str3 = new StringBuffer("Java Programming");
		
		System.out.println("Str1 Capacity "+str1.capacity());
		System.out.println("Str2 Capacity "+str2.capacity());
		System.out.println("Str3 Capacity "+str3.capacity());
		
		System.out.println("Str3 : "+str3.append(" by James Gosling"));
		System.out.println("Delete first 2 chars :  "+str3.delete(0, 2));
		System.out.println("Insert 'Ja' in first : "+str3.insert(0, "Ja"));
		System.out.println("Index of 'Ja'  : "+str3.indexOf("Ja"));
		System.out.println("Last Index of 'ja' : "+str3.lastIndexOf("Ja"));
		System.out.println("Reverse of String "+str3.reverse());
		str3.reverse();
		System.out.println("Substring  from 20 to 25 "+str3.substring(20, 25));
		
		
		
	}

}
