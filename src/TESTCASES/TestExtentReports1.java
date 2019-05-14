package TESTCASES;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pom.testcases.base.TestBase;
import com.facebook.pom.testcases.base.TestBase1;
import com.facebook.pom.utils.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class TestExtentReports1 extends TestBase1 {
	
	@Test
	public void checkTest(){
		
		extent = ExtentManager.getInstance("checkTest");
		extest = extent.startTest("Starting CheckTest");
		extest.log(LogStatus.INFO,"Starting CheckTest");
		extest.log(LogStatus.FAIL,"CheckTest Failed" + extest.addScreenCapture("C:\\Users\\Emman\\Desktop\\SELENIUM DIARY\\SELENIUM_PROJETS\\NEW PAPA PROJECTS\\POM_PRACTICE_MODULE23\\Screeshot\\TestShot.png"));
		extest.log(LogStatus.INFO,"exiting CheckTest");
		
		
	}
	
	@AfterMethod
	public void quit(){
		
		if(extent !=null){
			extent.endTest(extest);
		}
		
		extent.flush();
	}

}
