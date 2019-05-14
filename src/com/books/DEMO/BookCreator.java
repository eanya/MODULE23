package com.books.DEMO;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		Book  book1 = new Book("java 1st", 1);
		Book  book2 = new Book("java 2nd", 2);
		Book  book3 = new Book("java 3rd", 3);
		Books bookset = new Books();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
    System.out.println(" **** USING THE GETBOOK METHODS ************");		
	System.out.println("print from getbook " + books.get(1).getBook());
		
	System.out.println(" **** USING THE ARRAYLIST METHODS ************");	
		for(Book bks : books){
		 System.out.println("printList Book " + bks);
		 System.out.printf("printList Book %s \n ", bks);
		}
		
	System.out.println(" **** USING THE BOOK CLASS HELPER METHODS ************");	
		 bookset.setBooks(books);
		 List<Book> bkx = bookset.getBook();
		for(Book bks : bkx){
		 System.out.println("printList Book " + bks);
		}
    System.out.println(" **** USING ARRAY ************");
		Book hang[] = new Book[7];
		hang[0]=book1;
		hang[1]=book2;
		hang[2]=book3;
		for(int i=0; i<hang.length;i++){
			System.out.println("Array books print "+hang[i]);
			
		}
		System.out.println("Array books print (singles) "+hang[0]);
	}

}
