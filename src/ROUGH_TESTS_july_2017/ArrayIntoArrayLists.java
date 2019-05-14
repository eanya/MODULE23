package ROUGH_TESTS_july_2017;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntoArrayLists {

	public static void main(String[] args) {
		String iName[] = {"One","Two","Three","Four","Five"};
		String rName[] = {"rOne","rTwo","rThree","rFour","rFive","rSix","rSeven"};
		// Pass the Arrays into an ArrayList
		ArrayList<String> xIname = new ArrayList<String>(Arrays.asList(iName));
		ArrayList<String> xRname = new ArrayList<String>(Arrays.asList(rName));
		int i,j;
		//for(int i=0, i < xIname.size() && j=0,j<xRname;i++ j++){
		for(i=0,j=0;i<xIname.size()&&j< xRname.size(); i++,j++){
			while(j<xRname.size()){
				 System.out.println("xRname Elements " + xRname.get(j));
					j++;
				}
			while(i<xIname.size()){
			 System.out.println("xIname Elements " + xIname.get(i));
			 i++;
			}
			
			
			
		}
		System.out.println("Printing rIname "+ xIname);
		System.out.println("Printing xIname "+ xRname);
		//System.out.println("Printing rIname "+ rName);
		
		
	}

}
