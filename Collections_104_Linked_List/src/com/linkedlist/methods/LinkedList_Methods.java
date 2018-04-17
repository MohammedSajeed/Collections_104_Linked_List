package com.linkedlist.methods;

import java.util.LinkedList;

public class LinkedList_Methods {
	public static void main(String args[]) {
	       LinkedList<String> linkedlist = new LinkedList<String>(); /* Linked List Declaration */
	       linkedlist.add("Samsung");  /*add(String Element) is used for adding the elements to the linked list*/
	       linkedlist.add("NOKIA");
	       linkedlist.add("lg");
	       linkedlist.add("HTC");
	       linkedlist.add("Moto");
	       System.out.println("Linked List Content: " +linkedlist); /*Display Linked List Content*/
	       
	       linkedlist.addFirst("First Item"); /*Add First and Last Element*/
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);
	       Object firstvar = linkedlist.get(0); /*This is how to get and set Values*/
	       System.out.println("First element: " +firstvar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);
	       linkedlist.removeFirst(); /*Remove first and last element*/
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
	       linkedlist.add(0, "Newly added item"); /* Add to a Position and remove from a position*/
	       linkedlist.remove(2);
	       System.out.println("Final Content: " +linkedlist); 
	     }
}
