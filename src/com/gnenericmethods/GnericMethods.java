package com.gnenericmethods;

public class GnericMethods {
	
	//Generic Method display
	public static <E> void printArray(E[] inputArray){
		//Display Array 
		for(E element : inputArray){
			System.out.printf("%s \t ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// create Arrays of Interger, Double and Char
		Integer[] Array  = {1, 23, 334, 45654, 33};
		Double [] doubleArray = {1.1,2.3,3.4,4.6};
		Character[] charArr ={'H','L','Y', 'G'};
		System.out.println("Array, Integer Array Contains:");
		printArray(Array);
		System.out.println("Double, Double Array Contains:");
		printArray(doubleArray);
		System.out.println("Character, Char Array Contains:");
		printArray(charArr);

	}

}
