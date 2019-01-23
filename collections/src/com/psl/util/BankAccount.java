package com.psl.util;

public class BankAccount implements Comparable<BankAccount> {

	private String fullName;
	private String num;
	private double balance;
	
	public BankAccount(){

		super();
		}

	public BankAccount(String num, double balance) {
		super();
		this.num = num;
		this.balance = balance;
	}
	
	public BankAccount(String fullName, String num, double balance) {
		this(num,balance);
		this.fullName=fullName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString(){
		return String.format("BankAccount[%s,%f]",getNum(),getBalance());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public int compareTo(BankAccount anotherAccount) {
	
		if(getBalance()>anotherAccount.getBalance())
			return 1;
		else if(getBalance()<anotherAccount.getBalance())
			return -1;
		return 0;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
