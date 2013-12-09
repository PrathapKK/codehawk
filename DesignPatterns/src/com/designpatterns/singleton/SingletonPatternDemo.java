package com.designpatterns.singleton;

public class SingletonPatternDemo { 
	public static void main(String[] args) { 

		//illegal construct 
		//Compile Time Error: The constructor SingleObject() is not visible 

		//SingleObject object = new SingleObject(); 

		//Get the only object available 
		SingleObject object = SingleObject.getInstance(); 

		//show the message 

		object.showMessage(); 
		System.out.println("Object HashCode : "+object.hashCode());
		
		SingleObject object1 = SingleObject.getInstance();
		object1.showMessage();
		System.out.println("Object1 HashCode  : "+object1.hashCode());
		
	} 
}
