package com.psl.util;

public class MyRunnable implements Runnable{


	@Override
	public void run(){
		for(int x=1;x<=5;x++){
			System.out.println(String.format("%d %s",x,Thread.currentThread().getName()));
			try {
				Thread.sleep(2000);//sleep method is called ,thread will move from running to runnable for 
				//that time and this time is given to any other thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}