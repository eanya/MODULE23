package ROUGH_TESTS_july_2017;

import java.util.Arrays;
import java.util.Random;

public class StoreRandonNoInArray1 {

	public static void main(String[] args) {		
		int freq[] = new int[7];
		Random rand = new Random();
		
		//for(int i=1; i<100; i++){
		//Note this is adding 1 to this array for every INDEX that TURNS UP
		// freq[1+rand.nextInt(6)]= freq[1+rand.nextInt(6)] + 1;
			++freq[1+rand.nextInt(6)];
			//freq[1+rand.nextInt(6)]++;
			//freq[1+rand.nextInt(6)]=freq[1+rand.nextInt(6)]+1;
			//System.out.println(freq[1+rand.nextInt(6)]++);
	//}
		//System.out.println("Printing FREQ" + Arrays.toString(freq) );
		System.out.println("Face\tFreq");
		for(int face=1; face<freq.length; face++){
			System.out.println(face+"\t"+ freq[face]);
			
		}

	}

}
