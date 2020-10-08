package com.san.multithreading;

public class ThreasSleep extends Thread{

	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
	
	public static void main(String[] args) {
		ThreasSleep t1=new ThreasSleep();  
		ThreasSleep t2=new ThreasSleep();  
		   
		  t1.start();  
		  t2.start();

	}

}
