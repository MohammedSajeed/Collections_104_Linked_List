package com.linkedlist_iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Sajeed");  
		  al.add("Saif");  
		  al.add("Samar");  
		  al.add("Aliyas");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
