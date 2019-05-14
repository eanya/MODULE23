package com.INTERFACES.DEMO.MODULE4PART2;

public class TestAnimal {

	public static void main(String[] args) {
		//Animal a = new Animal();
  // You cannot create an object of an Interface but you create create and object Reference.
	
	Cat c = new Cat();
	c.run();
	c.sleep();
	c.move();
	c.hunt();
	
	Animal a = new Cat();
	a.run();
	a.sleep();
	a.move();
	// You can't call the a.hunt() fxn here as it is not an overridden function.
	Animal a1 = new Elephant();
	a1.move();
	a.sleep();
	Animal a2 = null;
	a2 = new Elephant();
	//a2 = new Cat();
	a2.run();
	
	}

}
