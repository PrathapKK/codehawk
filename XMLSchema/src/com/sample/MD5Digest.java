package com.sample;

import java.security.*;

public class MD5Digest {
	
	public static void main(String args[]) throws Exception{
		MessageDigest md = MessageDigest.getInstance("MD5");

		byte toChapter1 [] = "Prathap".getBytes() ;
		byte[] toChapter2 = null;
		 try {
		     md.digest(toChapter1);
		     System.out.println(md.);
		    /* MessageDigest tc1 = (MessageDigest) md.clone();
		     byte[] toChapter1Digest = tc1.digest();
		    
			md.update(toChapter2);*/
		     
		 } catch (Exception cnse) {
		     throw new DigestException("couldn't make digest of partial content");
		 }
	}

}
