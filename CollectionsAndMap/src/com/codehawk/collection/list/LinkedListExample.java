package com.codehawk.collection.list;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {
	
	public static void main(String args[]){
		
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(new String("Abdul"));
		linkedList.addFirst("AAA");
		linkedList.addLast("Last");
		
		
		System.out.println("Linked List "+linkedList);
		System.out.println("Contains AAA : "+linkedList.contains("AAA"));
		System.out.println("First "+linkedList.getFirst());
		System.out.println("Last "+linkedList.getLast());
		linkedList.offer("L");
		System.out.println("After Offer L "+linkedList);
		linkedList.offerFirst("OF");
		System.out.println("After OfferFirst "+linkedList);
		linkedList.offerLast("OL");
		System.out.println("After OfferLast "+linkedList);
		System.out.println("Peek "+linkedList.peek());
		System.out.println("Peek First :  "+linkedList.peekFirst());
		System.out.println("Peek Last :  "+linkedList.peekLast());
		System.out.println("Poll "+linkedList.poll());
		System.out.println("After Poll"+linkedList);
		System.out.println("Poll First "+linkedList.pollFirst());
		System.out.println("After PollFirst"+linkedList);
		System.out.println("Poll Last "+linkedList.pollLast());
		System.out.println("After PollLast"+linkedList);
		System.out.println(""+linkedList);
		System.out.println("Pop "+linkedList.pop());
		
		linkedList.push("Push ");
		System.out.println("After Push "+linkedList);
		
	}

}
