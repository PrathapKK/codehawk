package com.codehawk.collection.list;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String args[])
	{
		
		
		ArrayList namesList = new ArrayList();
		
		namesList.add("Abdul");
		namesList.add("Arun Kumar");
		namesList.add("Arun Christopher");
		namesList.add("Bala");
		namesList.add(3, "Antony");
		namesList.addAll(namesList);
		System.out.println();
		System.out.println("Is List Contains "+namesList.contains("Antony Doss"));
		
		
		
	}

}
