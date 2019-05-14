package com.INTERFACES.DEMO.MODULE4PART2;

public class Cat implements Animal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("Cat is moving");
		
	}

	@Override
	public void run() {
		System.out.println("Cat is running");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
		
	}
	
	public void hunt(){
		System.out.println("Cat Hunting");
	}

}
