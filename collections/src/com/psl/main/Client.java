package com.psl.main;

import java.util.Date;

import com.psl.util.NumberContainer;
import com.psl.util.Stack;

public class Client {
public static void main(String[] args) {
	
	Stack<String> s=new Stack<String>(10);
	Stack<Integer> i=new Stack<Integer>(10);
	Stack<Date> d=new Stack<Date>(10);
	
	s.push("Today");
	s.push("is");
	s.push("Tuesday");
	
	i.push(12);
	
	d.push(new Date());
	
	System.out.println(s.peek());
	
	String v=s.pop();
	
	System.out.println(s.pop());
	
	NumberContainer<Double> dbl=new NumberContainer<Double>();
	NumberContainer<Long> lng=new NumberContainer<Long>();
	
	dbl.hasSameAverage(lng);
}
}
