package com.psl.util;
import java.util.*;

public class GenericLinkedListImpl<T> implements GenericLinkedList<T> {

	private String data;
	
	public String getData() {
		return data;
	}

	public GenericLinkedListImpl(String data) {
		super();
		this.data = data;
	}


	public void setData(String data) {
		this.data = data;
	}

	@Override
	public boolean hasNext(GenericLinkedList<T> lists,int index) {
		if(lists.size()>index){
			return true;
		}
		else
		return false;
	}

	@Override
	public GenericLinkedList<T> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericLinkedList<T> reset() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
