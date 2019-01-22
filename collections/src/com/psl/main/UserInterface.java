package com.psl.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.psl.util.BankAccount;

public class UserInterface {

	public static void main(String[] args) {
		List<String> strs;
		
		strs=new ArrayList<String>();
		
		strs.add("New");
		strs.add("Day");
		strs.add("Ever");
		
		System.out.println(strs.get(2));
		System.out.println(strs.size());
		System.out.println(strs.remove(2));
		
		for(String s:strs){
			System.out.println(s);
		}
		
		if(strs.contains("day")){
			
		}
		if(strs.indexOf("New")==1){//contains and indexOf both calls he equals method to search
			
		}
		
		List<BankAccount> accounts;
		
		accounts=new LinkedList<BankAccount>();
		
		accounts.add(new BankAccount("1234",645.324));
		accounts.add(new BankAccount("1434",3453.124));
		accounts.add(new BankAccount("1834",6655.56));
		
		for(BankAccount ac:accounts){
			System.out.println(ac);
		}
		
		if(accounts.contains(new BankAccount("1234",0))){/*while using contains it is necessary to 
		override equals and hashcode method */
			System.out.println("found");
		}
		
		
		
	}
	
}
