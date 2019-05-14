package com.books.DEMO;

import java.util.List;

public class Books {
	
	List<Book> books;
	int totalPrice;
	
	public List<Book> getBook(){
		return books;
	}
	public List<Book> setBooks(List<Book> books){		
		return this.books = books;
	}
	
	public int getTotalPrice(){
		return totalPrice;
	}
	
   public int setTotalPrice(int price ){
	   return this.totalPrice=price;
   }

}
