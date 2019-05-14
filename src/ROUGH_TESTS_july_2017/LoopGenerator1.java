package ROUGH_TESTS_july_2017;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class LoopGenerator1 {

	
		// static int uk;	
	    Date dt = new Date();
		public static void main(String[] args) {
			//int[] uk = new int[6];
			Random rand = new Random();
			System.out.println("Printing The Five Main Board Numbers");
		for(int i=1; i<=5;i++){
			int ukk[] = {1+rand.nextInt(39)};
			//for (int k=0;k<1+rand.nextInt(6);k++){
		  // ++uk[1+rand.nextInt(6)];
				//++uk[k];
			System.out.println(Arrays.toString(ukk));
			}
		
		
		Random rand2 = new Random();
		System.out.println("Printing The Thunderballs");
		for(int i=1; i<=1;i++){
			int ukk = (1+rand2.nextInt(14));
			//for (int k=0;k<1+rand.nextInt(6);k++){
		  // ++uk[1+rand.nextInt(6)];
				//++uk[k];
			System.out.println(ukk);
			}
			//}
		
	}

}
