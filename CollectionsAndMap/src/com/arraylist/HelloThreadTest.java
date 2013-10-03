package com.arraylist;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


class HelloThread 
{

 int i=1;
 List arrayList;
  public  void go()
  {
 arrayList=new CopyOnWriteArrayList<String>();
 Thread thread1=new Thread(new Runnable() {

  public void run() {
  while(i<=10)
  {
   arrayList.add(i);
   i++;
  }
  }
 });
 thread1.start();
 Thread thred2=new Thread(new Runnable() {
  public void run() {
     while(true)
     {
   Iterator it=arrayList.iterator();
   synchronized(arrayList) {
	   
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
   }
     }
  }
 });
 thred2.start();
  }
 }

public class HelloThreadTest
{
  public static void main(String[] args)
  {
   HelloThread hello=new HelloThread();
   hello.go();
  }
}