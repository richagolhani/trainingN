package ContactDetails;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactDetails {
	public static void main(String[] args) {

		System.out
				.println("First_name, Middle_name, Last_name, DOB, Gender,\n Anniversary, Address,Area, "
						+ "City,Pincode, State\n, Country, Telephone_number, Mobile_number\n, Email, Website");
		Scanner s = new Scanner(System.in);

		Contact[] stack = new Contact[1];
		int k = 0;
		String f_name = s.nextLine();
		String l_name = s.nextLine();
		String dOB = s.nextLine();
		String t_number = s.nextLine();
		String num = s.nextLine();
		String email = s.nextLine();
		

		Contact obj = new Contact();

		obj.setFirst_name(f_name);
		obj.setDOB(dOB);
		obj.setEmail(email);
		obj.setLast_name(l_name);
		obj.setMobile_number(num);
		obj.setTelephone_number(t_number);
		

		try {
			validate(obj);
		} catch (ProductNotFound e) {
			System.out.println(e.getMessage());
		}

		try {
			push(obj,k,stack);
			pop(k,stack);

		} catch (StackOverOrUnderFlow e) {
			System.out.println("Overflow or underflow");
		}

	}

	public static void validate(Contact c) throws ProductNotFound {
		Pattern p = Pattern.compile("[a-zA-Z]*[0-9]*@[a-zA-Z]*[0-9]*");
		Matcher m = p.matcher(c.getEmail());
		boolean b = m.matches();

		if (c.getFirst_name() == null || c.getLast_name() == null
				|| c.getDOB() == null || c.getEmail() == null) {
			throw new ProductNotFound("some important details are missing");
		} else if (c.getTelephone_number() == null
				&& c.getMobile_number() == null) {
			throw new ProductNotFound("details missing");
		}
		if (b == false) {
			throw new ProductNotFound("email is incorrect");
		}

	}

	public static void push(Contact c, int k,Contact[] stack) throws StackOverOrUnderFlow {
		if (k < 3) {
			stack[k] = c;
			k++;
		} else {
			throw new StackOverOrUnderFlow("Stack overflow or underflow");
		}
	}
	public static void pop(int k,Contact[] stack) throws StackOverOrUnderFlow {
		if (k >= 0) {
			//Contact c = new Contact();
			stack[k]=null ;
			k--;
		} else {
			throw new StackOverOrUnderFlow("Stack overflow or underflow");
		}
	}
}
