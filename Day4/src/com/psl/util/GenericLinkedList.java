package com.psl.util;

public interface GenericLinkedList <T> {

	public boolean hasNext(GenericLinkedList<T> lists,int i);
	public GenericLinkedList <T> get();
	public GenericLinkedList <T> reset();
	
}
