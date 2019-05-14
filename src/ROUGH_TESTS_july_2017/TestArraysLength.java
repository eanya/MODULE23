package ROUGH_TESTS_july_2017;

import java.util.Arrays;

public class TestArraysLength {
	
	static String[] namesb = {"Wes","les","Rana"};
	static String[][] names = {{"Wes","les","Rana"},
		                         {"WesD","lesK","RanaF"}};
	

	public static void main(String[] args) {
		//names = {"Wes","les","Rana"};
		// TODO Auto-generated method stub
		//System.out.println("Array " + names.length);
		//System.out.println("Array " + names[2]);
		
		for(String[] i : names){
			System.out.println("Array " + Arrays.deepToString(i));
			System.out.println("Array " + Arrays.toString(i));
			// Mr. Smith
	       //System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	       // System.out.println(names[0][2] + names[1][1]);
			
		}

	}

}
