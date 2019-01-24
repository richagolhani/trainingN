package com.psl.util;

import java.util.LinkedList;
import java.util.List;

public class Client {

	public static <T> void main(String[] args) {
		List<GenericLinkedListImpl>lists;
		
		lists=new LinkedList<GenericLinkedListImpl>();
		
		lists.add(new GenericLinkedListImpl<T>("123"));
		lists.add(new GenericLinkedListImpl<T>("456"));
		int i=0;
		
		while(i<lists.size())
		{
			lists.hasNext(lists,i);
			i++;
		}
		
	}
}
