package com.books.DEMO;

public class Book {
	public String book;
	public int number;
	
	public Book(String book, int number){
		this.book = book;
		this.number = number;
	}
	
	public String getBook(){
		return book;
	}
	public int getNumber(){
		return number;
	}
	
	@Override
	public String toString(){
		return String.format("%s\t%d",this.book, this.number);
		
	}

}
