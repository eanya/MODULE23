package ROUGH_TESTS_july_2017;

import com.facebook.pom.utils.Xls_Reader;

public class getDataSktch {
	
	public static Object[][] getData(String testName, Xls_Reader XLS){
		
		int testStartDataIndex=0;
		for(int rNum =1; rNum<=XLS.getRowCount("TestData");rNum++){
			if(testName.equalsIgnoreCase(XLS.getCellData("TestData",0, rNum))){
				testStartDataIndex=rNum;
				break;
		}	
}
		System.out.println("******************************");	
	System.out.println("Test Starts From "+testStartDataIndex);
	
	
	// Now we exract the number of cols 
	int ColStartIndex = testStartDataIndex+1;
	int cols = 0;
	while(!XLS.getCellData("TestData",cols, ColStartIndex).equals("")){
		cols++;
	}
	
	System.out.println("Total cols are  "+cols);
	System.out.println("******************************");
		
		
		return null;
		
	}
	
	

}
