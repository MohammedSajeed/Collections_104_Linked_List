package com.userdefined.forlopp;

import java.util.LinkedList;
import java.util.List;

public class UserDefinedObject_LinkedList_ForLoop {

	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<Book> list=new LinkedList<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Java","James Gosling","Sun Microsystems/Oracle",10);  
	    Book b2=new Book(102,"Spring","Rod Johnson","Pivotol Software",10);  
	    Book b3=new Book(103,"Hibernate","Gavin King","Red HatSoftware",10);  
	    
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Book b:list){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}
