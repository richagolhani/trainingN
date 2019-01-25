package com.psl.main;

import com.psl.util.MyRunnable;
import com.psl.util.MyThread;

public class ThreadDemo {
	
	public static void main(String[] args) {
	
		MyThread mt1=new MyThread("One");
		//create the object of thread ,thread is in new state
		MyThread mt2=new MyThread("Two");
		MyThread mt3=new MyThread("Three");
		//new->runnable ,thread moves to runnable sate when start method is called
		mt1.start();//context switch happen between thread during sleep time of one thread
		mt2.start();//start method call run method,thread moves from runnable to running state
		mt3.start();//i.e. runnable->running
		
		//running->blocked state if resources(inputs) are not given or available
		//blocked->runnable state, when resource(input) become available
		//running->dead if execution completes or any exception occurs in its execution
		
		try {
			mt1.join();//join method Called by a "Thread"(here main Thread)on a "Thread" (here mt1,mt2 and mt3)
 			mt2.join();
			mt3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		MyRunnable r1=new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		MyRunnable r3= new MyRunnable();
		
		Thread rt1=new Thread(r1, "four");
		Thread rt2=new Thread(r2, "five");
		Thread rt3=new Thread(r3, "six");
		
		rt1.start();
		rt2.start();
		rt3.start();
		
	}
}
