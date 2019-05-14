package ROUGH_TESTS_july_2017;

import java.util.Arrays;
import java.util.Random;

public class StoreRandomNoInArray {

	public static void main(String[] args) {
		Random rand = new Random();
		int [] count = new int[6];
		//Integer countl = new Integer(8);
		for(int i=0; i<count.length; i++){
			count[i]= (rand.nextInt(39));
			//count[i]= (1+(rand.nextInt(39)));
	// count[i]=		(int)(Math.random()*10);
			//System.out.println(Arrays.toString(count));
		}
		System.out.println(Arrays.toString(count));
	}

}




