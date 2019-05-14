package com.OBJECT_REF.DEMO.MODULE4;

public class TestCar {

	public static void main(String[] args) {
		Car a = new Car(); 
		Car b = new Car(); 
		Car c = new Car(); 
		// Right now a Object has no Object ref and it's Object will be destroyed by Java Garbage collection
		// Objects Remain Constant In Memory While Object Refs Keep Changing
		a=b; b=c; c=a;
		a.Module="A";
		b.Module="B";
		c.Module="C";
		System.out.println(a.Module);
		System.out.println(b.Module);
		System.out.println(c.Module);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		
		

	}

}
