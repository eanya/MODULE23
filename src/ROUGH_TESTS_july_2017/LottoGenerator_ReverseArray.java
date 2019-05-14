package ROUGH_TESTS_july_2017;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class LottoGenerator_ReverseArray {
   // static int uk;	
    Date dt = new Date();
	public static void main(String[] args) {
		int uk[] = new int[7];
		Random rand = new Random();
	for(int i=1; i<=100;i++){
		//uk = 1+rand.nextInt(46);
		//for (int k=0;k<1+rand.nextInt(6);k++){
	   ++uk[1+rand.nextInt(6)];
			//++uk[k];
		}
		//}
	System.out.println("Face\tFrequency");
	for(int face=1; face<uk.length;face++){
		System.out.println(face+"\t"+uk[face]);
	}
	reverseArray(uk);
	reverse1(uk);
	//File file = new File(System.getProperty("user.dir")+"\\ScreenSHOT\\");
		}
	
	
	public static  int[]reverseArray(int list[]){
		int Result[] = new int [list.length];
		
		//for(int i=0; j=Result.length-1; i<list.length; i++; j--){
	    for (int i = 0, j = Result.length-1; i < list.length; i++, j--){
	    	 Result[j] = list[i];
	    	 
	    	// System.out.println("Printing Result " + list[i]);
	    	// System.out.println("Printing Result " + Result[j]);
		}
	    System.out.println("Printing Result " + Arrays.toString(Result));	
		return Result ;		
		
		
	}
	
	public static int[] reverse1(int list1[]){		
    int result[] = new int [list1.length];
    for(int i=0,j=result.length-1;i<list1.length;i++, j--){
    	result[j] = list1[i];
    }
		
    System.out.println("Printing Result " + Arrays.toString(result));
		return result;	
		
	}
	
	
	
	
	
	
 
	}


