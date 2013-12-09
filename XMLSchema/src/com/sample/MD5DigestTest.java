package com.sample;

import java.security.MessageDigest;

public class MD5DigestTest {
	
	
	
	public static String MD5(String inputString) throws Exception {
		String original = inputString;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(original.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(Integer.toHexString((int) (b & 0xff)));
		}
		return sb.toString();
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		/*if (args.length != 1) {
			System.err.println("String to MD5 digest should be first and only parameter");
			return;
		}*/
		String name = "Prathap";
		String original = name;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(original.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(Integer.toHexString((int) (b & 0xff)));
		}

		System.out.println("original:" + original);
		System.out.println("digested:" + digest);
		System.out.println("digested(hex):" + sb.toString());
		
		System.out.println("MD5 of 2013-10-10   :   " +MD5DigestTest.MD5("2013-10-10"));
		
		if("8e8847c1bdf01237ee13bb62da8a5c1".equals(MD5DigestTest.MD5("2013-10-10")))
		{
			System.out.println("MD5 digest is Equal");
		}
		
	}


}
