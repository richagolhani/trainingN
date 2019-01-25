package com.psl.util;

public class AccessCommonResource extends Thread{

private CommonResource commonResource;
	
	public  AccessCommonResource(CommonResource commonResource){
		this.commonResource=commonResource;
	}
	@Override
	public void run(){
		try {
			commonResource.getLock();
			for(int x=0;x<commonResource.getSize();x++){
				System.out.println(commonResource.getNumber(x));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			commonResource.releaseLock();
	}
}
