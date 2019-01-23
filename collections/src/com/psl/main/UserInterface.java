package com.psl.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.psl.util.Adhar;
import com.psl.util.BankAccount;
import com.psl.util.BankAccountFullNameComparator;

public class UserInterface {

	public static void main(String[] args) {
		List<String> strs;
		
		strs=new ArrayList<String>();
		
		strs.add("New");
		strs.add("Day");
		strs.add("Ever");
		
		System.out.println(strs.get(2));
		System.out.println(strs.size());
		//System.out.println(strs.remove(2));
		
		for(String s:strs){
			System.out.println(s);
		}
		System.out.println("===========");
		if(strs.contains("day")){
			
		}
		if(strs.indexOf("New")==1){//contains and indexOf both calls he equals method to search
			
		}
		
		Iterator<String> itr=strs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("==========");
		ListIterator<String> lst_itr=strs.listIterator();
		while(lst_itr.hasPrevious()){
			System.out.println(lst_itr.previous());
		}
		System.out.println("===========");
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
		
		System.out.println("================================");
		Set<BankAccount> acs;
		acs=new HashSet<BankAccount>();
		
		acs.add(new BankAccount("12345",623.23));
		acs.add(new BankAccount("1245",7623.23));
		acs.add(new BankAccount("22345",62893.23));
		
		System.out.println(acs.size());
		
		for(BankAccount ac:acs){
			System.out.println(ac);
		}
		
		System.out.println("===========================================");
		SortedSet<BankAccount> sortedBankAccounts;	
		
		sortedBankAccounts=new TreeSet<BankAccount>();
		
		sortedBankAccounts.add(new BankAccount("8908",32479.54));
		sortedBankAccounts.add(new BankAccount("6908",329.54));
		sortedBankAccounts.add(new BankAccount("398",3249.54));
	
		for(BankAccount ac:sortedBankAccounts){
			System.out.println(ac);
		}
		System.out.println("=================");
		sortedBankAccounts=new TreeSet<BankAccount>(new BankAccountFullNameComparator());
		
		sortedBankAccounts.add(new BankAccount("BillGates","273489",73287.45));
		sortedBankAccounts.add(new BankAccount("Mukesh Ambani","24589",73342.45));
		sortedBankAccounts.add(new BankAccount("JAck MA","23423",734237.4675));	
		sortedBankAccounts.add(new BankAccount("Lakshmi mittal","89489",732487.45));
		
		for(BankAccount ac:sortedBankAccounts){
			System.out.println(ac.getFullName()+"==="+ac);
		}
		
		System.out.println("==================");
		Set<BankAccount> accountObjects=new LinkedHashSet<BankAccount>();
		
		accountObjects.add(new BankAccount("AAA","3782",8932.657));
		accountObjects.add(new BankAccount("BBB","4382",8532.45));
		accountObjects.add(new BankAccount("CCC","3432",54432.6345));
		
		for(BankAccount ac:accountObjects){
			System.out.println(ac.getFullName()+"----"+ac);
		}
		
		Set<BankAccount> bk=new HashSet<BankAccount>();
		readFromCSV("some-file",bk);
		
		Set<BankAccount> tree=sortByBalanceThenByName(bk);
		
		Map<String,BankAccount> m;
		
		m=new HashMap<String,BankAccount>();
		
		m.put("4323",new BankAccount());
		m.put("5323",new BankAccount());
		m.put("7323",new BankAccount());
		
		System.out.println(m.get("5323"));
		
	
		
		for(Map.Entry<String, BankAccount> ac:m.entrySet()){
			System.out.println(ac.getKey());
			System.out.println(ac.getValue());
		}
	
		Map<Adhar,List<BankAccount>>data;
		
		data=new TreeMap<Adhar, List<BankAccount>>();
		//linkedHashMap
	}	
	
	public static Map<Adhar,List<BankAccount>> readFromFile(String filename){
		return null;
	}
	
	public static void fetchAccountDetailsFromDB(Map<Adhar,List<BankAccount>> data){
		
	}
		 public static Set<BankAccount> sortByBalanceThenByName(Set<BankAccount> acs){
			
			return null;
		}
	

	private static void readFromCSV(String string, Set<BankAccount> bk) {
	
		
	}
	
}
