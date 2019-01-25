package com.psl.main;

public class Client {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		for(int x=1;x<=5;x++){
			System.out.println(x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t.setName("main thread");//name of the thread is changed here
		System.out.println(t);
		//o/p [main,5,main]=name of thread=main and 5= priority it can be [1-10]
	}
}
