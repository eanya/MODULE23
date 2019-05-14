package ROUGH_TESTS_july_2017;

import java.util.Arrays;
import java.util.Random;

public class StoreRandonNoInArray_Manual {

	public static void main(String[] args) {		
		//Object freq[] =  new Object[7];
		Object freq[] =  new Object[7];
		int freq2[] =  new int[7];
		Random rand = new Random();
		for(int i=0; i<1000; i++){
			//++freq2[1+ rand.nextInt(5)];
			freq2[1+ rand.nextInt(5)] = freq2[1+ rand.nextInt(5)] + 1;
		}
		
		Integer fref[] = {1,23,4,4,1,23,4};
		 freq[0]=12;
		 freq[1]=1;
		 freq[2]=12;
		 freq[3]=12;
		 freq[5]="Soul Science";
	  System.out.println("Face\tFreq");
	  for(int face=0; face<fref.length; face++){
		  System.out.println(face + "\t" + fref[face]);
	  }
	  
	  System.out.println("Face1\tFreq");
	  for(int face1=0; face1<freq.length; face1++){
		  System.out.println(face1 + "\t" + freq[face1]);
	  }
	  
	  System.out.println("FACE2\tFREQ2");
	  for(int face2=1; face2<freq2.length; face2++){
		  System.out.println(face2 + "\t" + freq2[face2]);
		  
	  }
			
		
			
		

	}

}
