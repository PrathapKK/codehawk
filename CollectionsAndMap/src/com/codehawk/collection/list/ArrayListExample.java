package com.codehawk.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
		System.out.println("Is List Contains 'Antony Doss'"+namesList.contains("Antony Doss"));
		Iterator iterator = namesList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(" Has Code  Element "+iterator.next());
		}
		
		List syncList = Collections.synchronizedList(namesList);
		System.out.println("Synchronized list "+syncList);
		
	}

}
