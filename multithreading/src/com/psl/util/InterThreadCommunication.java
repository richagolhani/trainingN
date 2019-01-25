package com.psl.util;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
	
	CommonResource commonResource;
	commonResource=new CommonResource();
	
	new UpdateCommonResource(commonResource).start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	new AccessCommonResource(commonResource).start();
	}
}
