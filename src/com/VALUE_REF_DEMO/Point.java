package com.VALUE_REF_DEMO;

public class Point {
	static int x;
	static int y;

	public static void main (String args[]){
		Point GK = new Point();
		
		GK.x=3;
		GK.y =4;
		System.out.println("Printing b4 swap");
		System.out.println("print a and b " + GK.x + " " + GK.y );
		//swap(a,b);
		swapVal(GK);
		System.out.println("printing After Swap");
	    System.out.println("print a and b " + GK.x + " " + GK.y );
	 
		
	}
	
	public static void swap(int a, int b){
		int temp = a;
		a=b;
		temp = b;
		
	}
	
	public static void swapVal(Point p){
		
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		
	}
	
	
	
	
	
	

}
