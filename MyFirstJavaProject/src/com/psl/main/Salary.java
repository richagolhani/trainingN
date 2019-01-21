package com.psl.main;

public class Salary {
	public static void main(String[] args) {
	
		double sal=50000,DA,HR,Gross_sal,I_tax,Net_sal;
		DA=10*50000/100;
		HR=7*50000/100;
		Gross_sal=sal+DA+HR;
		I_tax=8*Gross_sal/100;
		Net_sal=Gross_sal-I_tax;
		System.out.println("Basic salary= "+sal+"\nDearness Allowance= "+DA+"\nHouse rent= "+HR+"\nGross salary= "+Gross_sal+
				"\nIncome tax= "+I_tax+"\nNet salary= "+Net_sal);
		
	}

}
