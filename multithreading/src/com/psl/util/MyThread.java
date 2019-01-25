package com.psl.util;

public class MyThread extends Thread {

	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run(){
		for(int x=1;x<=5;x++){
			System.out.println(String.format("%d %s",x,getName()));
			try {
				Thread.sleep(1000);//sleep method is called ,thread will move from running to runnable for 
				//that time and this time is given to any other thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
